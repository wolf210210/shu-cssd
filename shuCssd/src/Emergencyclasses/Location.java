/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emergencyclasses;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author wolf
 */
public class Location  implements  Serializable  {
    private Double latitude;
    private Double longitude;
    private int sensorID  ;
     private static int locationNo = 0;
  Location locations;
    
    public Location() {
     
    } 
  
  
     public Location(Double latitudes, Double longitudes ,int sensorID) {
        this.latitude = latitudes;
        this.longitude = longitudes;
        this.sensorID = sensorID; 
        
    } 
      
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    
     public int getSensorID() {
        return sensorID;
    }
    public int getSensorNo() {
        return sensorID;
    }
    
                   //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(locationNo);
       

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        locationNo = (Integer) ois.readObject();
    
    }

  
    
}
