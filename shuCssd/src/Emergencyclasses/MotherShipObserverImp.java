/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emergencyclasses;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import serialization.Serialization;

/**
 *
 * @author wolf
 */
public class MotherShipObserverImp implements Mothership{
  String personName;
    private int sensorID;
    private String availabiliy;

   

    private static final String FILE_NAME_Products = "DataFiles/BinSensors.txt";
    private SensorMonitor sensorSet = new SensorMonitor();

    public MotherShipObserverImp(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
		return personName;
	}

    public void setPersonName(String personName) {
		this.personName = personName;
	}
     public String getAvailabiliy() {
        return availabiliy;
    }

    public void setAvailabiliy(String availabiliy) {
        this.availabiliy = availabiliy;
    } 
    @Override
    public void update(String availability) {
        System.out.println("Hello "+personName+", Product is now "+availabiliy+" on flipkart");
        this.availabiliy =availability;

    }
    
}
