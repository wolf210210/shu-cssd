/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emergencyclasses;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author wolf
 */
public class SetOfLocation extends Vector<Location> implements Serializable  {
    
 SetOfLocation locationSet;
      
    public SetOfLocation() {
        super();
    }
    
    public void addNewSensor(Location aLocation){
          super.add(aLocation);
    }
       
    public SetOfLocation getLocationFromSensorID(int number) {
        
                locationSet = new SetOfLocation();
                for (Location location : this) {
                    if (location.getSensorNo() == number) {
                        locationSet.addNewSensor(location);
                    }
                }
                return locationSet;
    }
    
       public Double getLatitudeFromSensorID(int number) {
        
                Double tempLat =0.0 ; 
                for (Location location : this) {
                    if (location.getSensorNo() == number) {
                         tempLat  =location.getLatitude();
                    }
                }
                return tempLat;
    }
    
    
      public boolean remove(Location loc) {
         return super.remove(loc);
    }
}
