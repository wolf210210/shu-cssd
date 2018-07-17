/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import serialization.Serialization;
import userclasses.User;

/**
 *
 * @author wolf
 */
public class MotherShipObserverImp {
  String personName;
    private int sensorID;
    private String availabiliy;

   

    private static final String FILE_NAME_Products = "DataFiles/BinSensors.txt";
    private SensorMonitor sensorSet = new SensorMonitor();

    /**MotherShipObserverImp
     *
     * @param personName
     */
    public MotherShipObserverImp(String personName) {
        this.personName = personName;
    }

    /**getPersonName
     *
     * @return personName
     */
    public String getPersonName() {
		return personName;
	}

    /**setPersonName
     *
     * @param personName
     */
    public void setPersonName(String personName) {
		this.personName = personName;
	}

    /**getAvailabiliy
     *
     * @return availabiliy 
     */
    public String getAvailabiliy() {
        return availabiliy;
    }

    /**setAvailabiliy
     *
     * @param availabiliy
     */
    public void setAvailabiliy(String availabiliy) {
        this.availabiliy = availabiliy;
    } 
//    @Override

    /**update
     *
     * @param availabilitys
     */
    public void update(String availabilitys) {
        System.out.println("Hello "+personName+", Sensor is now "+availabilitys+" and notified");
        this.availabiliy =availabilitys;

    }
    
}
