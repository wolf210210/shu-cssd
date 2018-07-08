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
    EmbellishedData embelishedData = new  EmbellishedData();

    public Mothership(String ID) {
        this.ID = ID;
        this.SensorStations = SensorStations;
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
    
    public void addNewSensorStation(){
        
    }
    
    public void removeNewSensorStation(){
        
    }
    
    public void getSensorStation(){
        
    }
    
    public void receiveStationData(){
        
    }
   
}
