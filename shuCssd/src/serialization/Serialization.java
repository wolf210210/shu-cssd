/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import Product.SetOfProductStock;
import binclasses.SensorMonitor;

import binclasses.SetOfLocation;


//import farm.SetOfFarm;
//import Classes.fertilizer.SetOfFertilizer;
//import Classes.harvest.SetOfHarvest;
//import Classes.payment.SetOfCart;
//import Classes.sensors.SetOfSensors;
//import Classes.user.SetOfRandomCode;
//import Classes.user.SetOfUsers;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import userclasses.SetOfUsers;

/**
 *
 * @author Sachi
 */
public class Serialization {

    /**
     * Serialize
     *
     * @param object
     * @param filename
     * @throws java.io.IOException
     */
    public static void Serialize(Object object, String filename) throws IOException {

        try (FileOutputStream out = new FileOutputStream(filename)) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(object);
            oos.flush();
        }
        System.out.println(filename + " Serialized !");
    }

 
    public static SensorMonitor deserializeBinSensors() throws IOException, ClassNotFoundException {

        SensorMonitor sensorMonitor;
        try (FileInputStream in = new FileInputStream("DataFiles/BinSensors.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            sensorMonitor = (SensorMonitor) ois
                    .readObject();
        }

        return sensorMonitor;
    }
    
        public static SetOfLocation deserializeBinSensorsLocation() throws IOException, ClassNotFoundException {

        SetOfLocation sensorLocation;
        try (FileInputStream in = new FileInputStream("DataFiles/BinSensorsLocation.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            sensorLocation = (SetOfLocation) ois
                    .readObject();
        }

        return sensorLocation;
    }

        
        
    public static floodclasses.SensorMonitor deserializeFloodSensors() throws IOException, ClassNotFoundException {

       floodclasses.SensorMonitor sensorMonitor;
        try (FileInputStream in = new FileInputStream("DataFiles/FloodSensors.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
           sensorMonitor = (floodclasses.SensorMonitor) ois
                    .readObject();
        }

        return sensorMonitor;
    }
    
       public static SetOfUsers deserializeUsers() throws IOException, ClassNotFoundException {

        SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/Users.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (SetOfUsers) ois
                    .readObject();
        }

        return users;
    }

    public static SetOfProductStock deserializeProductsStock() throws IOException, ClassNotFoundException {

        SetOfProductStock products;
        try (FileInputStream in = new FileInputStream("DataFiles/ProductsStock.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            products = (SetOfProductStock) ois
                    .readObject();
        }

        return products;
    }


}
