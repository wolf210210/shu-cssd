/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;

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
public class SensorTest {
//     private static Sensor[] sensorOne;
       Sensor instance = new Sensor();
    public SensorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
//        sensor = new Sensor[3];
//       
       instance = new Sensor("Fahrenheit", "Ray Bradbury", 10.2, "Available");
//        sensor[1] = new Sensor("The Da Vinci Code", "Dan Brown", 11.0, "Ray Bradbury");
//        sensor[2] = new Sensor("Predictably Irrational", "Dan Ariely", 12.0, "Ray Bradbury");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Sensor.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Predictably Irrational";
     
        instance.setName(name);
        
    }

    /**
     * Test of setDescription method, of class Sensor.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String des = "Ray Bradbury";
       
        instance.setDescription(des);
     
    }

    /**
     * Test of getSensorNo method, of class Sensor.
     */
    @Test
    public void testGetSensorNo() {
        System.out.println("getSensorNo");
      
        int expResult = 1;
        int result = instance.getSensorNo();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getName method, of class Sensor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
      
        String expResult = "Fahrenheit";
        String result = instance.getName();
       assertEquals(expResult, result);
           
        
      
    }

    /**
     * Test of setfrequency method, of class Sensor.
     */
    @Test
    public void testSetfrequency() {
        System.out.println("setfrequency");
        double frq = 5.0;
        Sensor instance = new Sensor();
        instance.setfrequency(frq);
      
    }

    /**
     * Test of getfrequency method, of class Sensor.
     */
    @Test
    public void testGetfrequency() {
        System.out.println("getfrequency");
    
        double expResult = 10.2;
        double result = instance.getfrequency();
        assertEquals(expResult, result,10.2);

   
    }

    /**
     * Test of getStatus method, of class Sensor.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
       
        String expResult = "Available";
        String result = instance.getStatus();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getdescription method, of class Sensor.
     */
    @Test
    public void testGetdescription() {
        System.out.println("getdescription");
        String expResult = "Ray Bradbury";
        String result = instance.getdescription();
        assertEquals(expResult, result);

    }
    
}
