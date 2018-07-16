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
public class ClockTest {
    public  Clock clock = Clock.getInstance(); 
       private static Clock instance = null;
    public ClockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Clock();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class Clock.
     */
 //   @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        Clock expResult = new Clock();
//        Clock result = Clock.getInstance();
//        assertEquals(expResult, result);
//    
//    }

    /**
     * Test of notifyObservers method, of class Clock.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
       
        instance.notifyObservers();
     
    }

    /**
     * Test of registerObserver method, of class Clock.
//     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        SensorMonitor observer = new SensorMonitor();
//        Clock instance = new Clock();
        instance.registerObserver(observer);
      
    }

    /**
     * Test of unregisterObserver method, of class Clock.
     */
    @Test
    public void testUnregisterObserver() {
        System.out.println("unregisterObserver");
        SensorMonitor observer = new SensorMonitor();
//        Clock instance = new Clock();
        instance.unregisterObserver(observer);
       
    }

    /**
     * Test of tractTime method, of class Clock.
     */
    @Test
    public void testTractTime() {
        System.out.println("tractTime");
    
        instance.tractTime();
        
    }

    /**
     * Test of waitForTime method, of class Clock.
     */
    @Test
    public void testWaitForTime() {
        System.out.println("waitForTime");
       
        instance.waitForTime();
      
    }

    /**
     * Test of notifyAllObservers method, of class Clock.
     */
    @Test
    public void testNotifyAllObservers() {
        System.out.println("notifyAllObservers");
     
        instance.notifyAllObservers();
       
    }

    /**
     * Test of mills method, of class Clock.
     */
    @Test
    public void testMills() {
        System.out.println("mills");
        long timeInMiles = 0L;
        Clock instance = new Clock();
        long expResult = 0L;
        long result = instance.mills(timeInMiles);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Clock.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        
        instance.run();
       
    }
    
}
