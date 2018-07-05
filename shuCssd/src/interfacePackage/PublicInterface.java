/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author wolf
 */
public class PublicInterface extends Vector<PublicInterface> implements Mothership, Serializable{

    private double location; 
    
    private static int locationIDTracker = 0 ; 
    
    private int locationID; 
    
    private SensorStation sensorMonitor;
    
//    public PublicInterface(SensorStation sensorMonitor ){
//        this.sensorMonitor = sensorMonitor;
//        this.locationID = ++locationIDTracker;
//        
//        System.out.println("new observer" + this.locationID);
//        
//        sensorMonitor.registerObserver(this);
//        
//    }
    public PublicInterface(){
        
    }
    
    public void addNewSensorStation(SensorStation sensorMonitor){
            this.sensorMonitor = sensorMonitor;
        this.locationID = ++locationIDTracker;
        
        System.out.println("new observer" + this.locationID);
        
        sensorMonitor.registerObserver(this);
    }
    
    @Override
    public void update(double loction) {
       this.location =  loction;
       printThe();
    }
    
    public void printThe(){
        System.out.println(locationID + "\nlocation : " + location );
    }
    
     public double Getlocation() {
        return  location;
    }
     
      public int GetlocationID() {
        return locationID;
    }
    
}
