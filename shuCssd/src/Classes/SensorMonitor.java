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
public class SensorMonitor implements Serializable {
    private String SensorMonitorID;
    private ArrayList<Double> coords;
    private Boolean isActive;
    private Double interval;
    private SensorStation observers = null;
    private long LastReadingTime;
    public static int ReadingsCount=0;
    private Sensor sensor = null;    
    Data Reading; 

    public SensorMonitor(String SensorMonitorID, ArrayList<Double> coords, Boolean isActive, Double interval, long LastReadingTime, Data Reading) {
        this.SensorMonitorID = SensorMonitorID;
        this.coords = coords;
        this.isActive = isActive;
        this.interval = interval;
        this.LastReadingTime = LastReadingTime;
        this.Reading = Reading;
    }

    public String getSensorMonitorID() {
        return SensorMonitorID;
    }

    public void setSensorMonitorID(String SensorMonitorID) {
        this.SensorMonitorID = SensorMonitorID;
    }

    public ArrayList<Double> getCoords() {
        return coords;
    }

    public void setCoords(ArrayList<Double> coords) {
        this.coords = coords;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Double getInterval() {
        return interval;
    }

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public SensorStation getObservers() {
        return observers;
    }

    public void setObservers(SensorStation observers) {
        this.observers = observers;
    }

    public long getLastReadingTime() {
        return LastReadingTime;
    }

    public void setLastReadingTime(long LastReadingTime) {
        this.LastReadingTime = LastReadingTime;
    }

    public static int getReadingsCount() {
        return ReadingsCount;
    }

    public static void setReadingsCount(int ReadingsCount) {
        SensorMonitor.ReadingsCount = ReadingsCount;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Data getReading() {
        return Reading;
    }

    public void setReading(Data Reading) {
        this.Reading = Reading;
    }
    
    
}
