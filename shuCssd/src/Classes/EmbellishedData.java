/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wolf
 */
public class EmbellishedData implements Serializable {

    public EmbellishedData(Data data, Long TimeInMiles, ArrayList<Double> Location, String sensorID) {
        this.data = data;
        this.TimeInMiles = TimeInMiles;
        this.Location = Location;
        this.sensorID = sensorID;
    }
    public Data data;
    public Long TimeInMiles;
    public ArrayList<Double> Location;
    public String sensorID;

    EmbellishedData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Long getTimeInMiles() {
        return TimeInMiles;
    }

    public void setTimeInMiles(Long TimeInMiles) {
        this.TimeInMiles = TimeInMiles;
    }

    public ArrayList<Double> getLocation() {
        return Location;
    }

    public void setLocation(ArrayList<Double> Location) {
        this.Location = Location;
    }

    public String getSensorID() {
        return sensorID;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }
    
    public void EmbellishedData(){
        
    }
    
}
