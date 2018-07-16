/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floodclasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wolf
 */
public class SensorMonitorTest {
    
    private static Sensor[] sensor;
     private SensorMonitor instance ;
    
    public SensorMonitorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
           sensor = new Sensor[3];
       
        sensor[0] = new Sensor("Fahrenheit", "Ray Bradbury", 10.2, "Ray Bradbury");
        sensor[1] = new Sensor("The Da Vinci Code", "Dan Brown", 11.0, "Ray Bradbury");
        sensor[2] = new Sensor("Predictably Irrational", "Dan Ariely", 12.0, "Ray Bradbury");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SensorMonitor();
        for(int i = 0; i < sensor.length; ++i) {
            instance.addNewSensor(sensor[i]);
//            System.err.println(sensor[i].getSensorNo());
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateSensors method, of class SensorMonitor.
     */
    @Test
    public void testUpdateSensors() {
        System.out.println("updateSensors");
        Sensor aSensor = sensor[2] ;
        String Name = "";
        String description = "";
        Double frequency = 0.0;
        String statusUp = "";
      
        String expResult = "";
        String result = instance.updateSensors(aSensor, Name, description, frequency, statusUp);
    
    }

    /**
     * Test of getSensorFromID method, of class SensorMonitor.
     */
    @Test
    public void testGetSensorFromID() {
        System.out.println("getSensorFromID");
        int number = 6;
//        SensorMonitor instance = new SensorMonitor();
//        Sensor expResult = sensor[0];
        SensorMonitor result = instance.getSensorFromID(number);
          assertEquals(0, result.size());

          }

    /**
     * Test of getSensorFromName method, of class SensorMonitor.
     */
    @Test
    public void testGetSensorFromName() {
         SensorMonitor result;
        System.out.println("getSensorFromName");
        String name = "Fahrenheit";
//        SensorMonitor instance = new SensorMonitor();
//        Sensor expResult = sensor[0];
        result = instance.getSensorFromName(name);
         assertEquals(1, result.size());
         assertEquals(sensor[0], result.get(0));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewSensor method, of class SensorMonitor.
     */
    @Test
    public void testAddNewSensor() {
        System.out.println("addNewSensor");
        
//        SensorMonitor instance = new SensorMonitor();
        instance.addNewSensor(new Sensor("test", "test", 12.0, "test"));
        
    }

    /**
     * Test of setStatus method, of class SensorMonitor.
     */
//    @Test
//    public void testSetStatus() {
//        System.out.println("setStatus");
//        String status = "";
//        SensorMonitor instance = new SensorMonitor();
//        instance.setStatus(status);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getStatus method, of class SensorMonitor.
     */
//    @Test
//    public void testGetStatus() {
//        System.out.println("getStatus");
//        SensorMonitor instance = new SensorMonitor();
//        String expResult = "";
//        String result = instance.getStatus();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setAvailability method, of class SensorMonitor.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        String availabilitys = "Available";
        SensorMonitor instance = new SensorMonitor();
        instance.setAvailability(availabilitys);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerObserver method, of class SensorMonitor.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        Mothership motherShip = null;
        SensorMonitor instance = new SensorMonitor();
        instance.registerObserver(motherShip);
        
    
    }

    /**
     * Test of unregisterObserver method, of class SensorMonitor.
     */
    @Test
    public void testUnregisterObserver() {
        System.out.println("unregisterObserver");
        Mothership motherShip = null;
        SensorMonitor instance = new SensorMonitor();
        instance.unregisterObserver(motherShip);
    
    }

    /**
     * Test of notifyObservers method, of class SensorMonitor.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        SensorMonitor instance = new SensorMonitor();
        instance.notifyObservers();
        
    }

    /**
     * Test of remove method, of class SensorMonitor.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Sensor sen = null;
        
        boolean expResult = false;
        boolean result = instance.remove(sen);
        assertEquals(expResult, result);
       

    }

    /**
     * Test of doTick method, of class SensorMonitor.
     */
    @Test
    public void testDoTick() {
        System.out.println("doTick");
        SensorMonitor instance = new SensorMonitor();
        instance.doTick();
        
    }

    
    
}
