/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floodclasses;

import GUI.SensorObserverMap;

/**
 *
 * @author Piyu
 */
public class EmbellishedData {

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
     */
    public EmbellishedData() {
        System.out.println("awooooo");
        SensorObserverMap obj = new SensorObserverMap() ; 
        obj.setVisible(true);
 
    }
}
