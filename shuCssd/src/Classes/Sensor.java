/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author wolf
 */
public class Sensor implements Serializable {
     private String sensorID;

    public Sensor(String sensorID) {
        this.sensorID = sensorID;
    }
    
    public String getSensorID() {
        return sensorID;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }
   

   
    
    
}
