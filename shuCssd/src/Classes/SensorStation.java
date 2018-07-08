/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wolf
 */
public class SensorStation implements Serializable {

    public SensorStation(String stationID, List<SensorMonitor> SensorsMonitors) {
        this.stationID = stationID;
        this.SensorsMonitors = SensorsMonitors;
    }
     private String stationID;
    private List<SensorMonitor> SensorsMonitors;
    private static Mothership observer = null; 

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public List<SensorMonitor> getSensorsMonitors() {
        return SensorsMonitors;
    }

    public void setSensorsMonitors(List<SensorMonitor> SensorsMonitors) {
        this.SensorsMonitors = SensorsMonitors;
    }

    public static Mothership getObserver() {
        return observer;
    }

    public static void setObserver(Mothership observer) {
        SensorStation.observer = observer;
    }

   

   
    
    
    
}
