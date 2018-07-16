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
public class LocationTest {
     Location instance ;
    public LocationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
          instance = new Location(1.2,1.2,1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLatitude method, of class Location.
     */
    @Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
       
        Double expResult = 1.2;
        Double result = instance.getLatitude();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLatitude method, of class Location.
     */
    @Test
    public void testSetLatitude() {
        System.out.println("setLatitude");
        Double latitude = 1.2;
        Location instance = new Location();
        instance.setLatitude(latitude);

    }

    /**
     * Test of getLongitude method, of class Location.
     */
    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        
        Double expResult = 1.2;
        Double result = instance.getLongitude();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getSensorID method, of class Location.
     */
    @Test
    public void testGetSensorID() {
        System.out.println("getSensorID");
    
        int expResult = 1;
        int result = instance.getSensorID();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getSensorNo method, of class Location.
     */
    @Test
    public void testGetSensorNo() {
        System.out.println("getSensorNo");
       
        int expResult = 1;
        int result = instance.getSensorNo();
        assertEquals(expResult, result);
   
    }
    
}
