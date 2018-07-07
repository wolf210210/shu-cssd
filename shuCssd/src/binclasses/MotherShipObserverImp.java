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

     private int productID;
    private String state;
    private double quantity, price;

    private static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private SensorMonitor productSet = new SensorMonitor();

    public MotherShipObserverImp(int productID) {
        this.productID = productID;
    }

    
    @Override
    public void update(SensorStation sensorStation) {
          this.state = sensorStation.getStatus();


        try {
            for (Sensor sensor : Serialization.deserializeBinSensors()) {

                productSet.add(sensor);

            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MotherShipObserverImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Sensor sensor : productSet) {
            if (sensor.getSensorNo() == productID) {
//                sensor.setAvalability("Yes");
//                sensor.setPrice(price);
                double oldQuantity = sensor.getfrequency();
                sensor.setfrequency((oldQuantity + quantity));

                try {
                    Serialization.Serialize(productSet, FILE_NAME_Products);
                    for (Sensor SensorUp : Serialization.deserializeBinSensors()) {
                        System.out
                                .println("Observer recieved state change of subject ID is = "
                                        + SensorUp.getSensorNo() + " Availability = " + SensorUp.getStatus() + " Price = "  + " frequency = " + SensorUp.getfrequency());
//+ SensorUp.getPrice()
                    }
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(SensorMonitor.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            }

        }
    }
    
}
