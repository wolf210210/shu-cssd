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
public class Mothership implements Serializable {
    
    private String ID;
    private static List<SensorStation> SensorStations = null;
    

    public Mothership(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public static List<SensorStation> getSensorStations() {
        return SensorStations;
    }

    public static void setSensorStations(List<SensorStation> SensorStations) {
        Mothership.SensorStations = SensorStations;
    }
    
    public SensorStation addNewSensorStation(SensorStation stationID){
        return stationID;
    }
    
    public SensorStation removeNewSensorStation(SensorStation stationID){
        return stationID;
    }
    
    public List<SensorStation> getSensorStation(List<SensorStation> SensorStations){
        return SensorStations;
    }
    
    public EmbellishedData receiveStationData(EmbellishedData embelishedData){
        return embelishedData ;
    }
   
}
