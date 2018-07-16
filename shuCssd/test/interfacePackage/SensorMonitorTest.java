/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

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
    
    public SensorMonitorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registerObserver method, of class SensorMonitor.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        Mothership newMothership = null;
        SensorMonitor instance = new SensorMonitor();
        instance.registerObserver(newMothership);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unregisterObserver method, of class SensorMonitor.
     */
    @Test
    public void testUnregisterObserver() {
        System.out.println("unregisterObserver");
        Mothership deleteMothership = null;
        SensorMonitor instance = new SensorMonitor();
        instance.unregisterObserver(deleteMothership);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyObservers method, of class SensorMonitor.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        SensorMonitor instance = new SensorMonitor();
        instance.notifyObservers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class SensorMonitor.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        double newLoacation = 0.0;
        SensorMonitor instance = new SensorMonitor();
        instance.setLocation(newLoacation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
