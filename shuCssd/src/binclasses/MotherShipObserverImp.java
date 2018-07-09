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

/**
 *
 * @author wolf
 */
public class MotherShipObserverImp implements Mothership{

    private int sensorID;
    private String state;

    private static final String FILE_NAME_Products = "DataFiles/BinSensors.txt";
    private SensorMonitor sensorSet = new SensorMonitor();

    public MotherShipObserverImp(int sensorID) {
        this.sensorID = sensorID;
    }

    
    @Override
    public void update(SensorStation sensorStation) {
          this.state = sensorStation.getStatus();


        try {
            for (Sensor sensor : Serialization.deserializeBinSensors()) {

                sensorSet.add(sensor);

            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MotherShipObserverImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Sensor sensor : sensorSet) {
            if (sensor.getSensorNo() == sensorID) {

                double oldQuantity = sensor.getfrequency();  

                try {
                    Serialization.Serialize(sensorSet, FILE_NAME_Products);
                    for (Sensor SensorUp : Serialization.deserializeBinSensors()) {
//                        System.out
//                                .println("Observer recieved state change of subject ID is = "
//                                        + SensorUp.getSensorNo() + " Availability = " + SensorUp.getStatus() + " Price = "  + " frequency = " + SensorUp.getfrequency());

                    }
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(SensorMonitor.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            }

        }
    }
    
}
