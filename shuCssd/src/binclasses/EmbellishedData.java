/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Piyu
 */
public class EmbellishedData implements  Serializable{
    
    /**
     *
     */
    public Long TimeInMiles;
     SensorMonitor monitorSet;

    /**
     *
     */
    public String sensorID;
//        private List<SensorMonitor> observers ;
    
    /**EmbellishedData
     *
     * @param sensorMonitor
     */
    public EmbellishedData(SensorMonitor sensorMonitor) {
       
        
         for (Sensor ob : sensorMonitor) {
//                      System.out.println("Notifying all the subscribers when the bin is full oi");
                     System.out.println("wadda EmbellishedData");
                     
                 }
                   
    }

   
}
    
        
