/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import Product.SetOfProductStock;
import binclasses.Mothership;
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        
           public static floodclasses.SetOfLocation deserializeFloodSensorsLocation() throws IOException, ClassNotFoundException {

        floodclasses.SetOfLocation sensorLocation;
        try (FileInputStream in = new FileInputStream("DataFiles/FloodSensorsLocation.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            sensorLocation = (floodclasses.SetOfLocation) ois
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
     public static floodclasses.SetOfUsers deserializeFloodUsers() throws IOException, ClassNotFoundException {

        floodclasses.SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/FILE_NAME_Users_FloodSensor.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (floodclasses.SetOfUsers) ois
                    .readObject();
        }

        return users;
    }
     
       public static floodclasses.SetOfUsers deserializeFloodUsersOne() throws IOException, ClassNotFoundException {

        floodclasses.SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/FILE_NAME_Set_Users_FloodSensor1.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (floodclasses.SetOfUsers) ois
                    .readObject();
        }

        return users;
    }
       
        public static floodclasses.SetOfUsers deserializeFloodUsersTwo() throws IOException, ClassNotFoundException {

        floodclasses.SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/FILE_NAME_Set_Users_FloodSensorTwo.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (floodclasses.SetOfUsers) ois
                    .readObject();
        }

        return users;
    }
        
        
           public static floodclasses.SetOfUsers deserializeFloodUsersThree() throws IOException, ClassNotFoundException {

        floodclasses.SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/FILE_NAME_Set_Users_FloodSensorThree.txt")) {
            ObjectInputStream ois = new ObjectInputStream(in);
            users = (floodclasses.SetOfUsers) ois
                    .readObject();
        }

        return users;
    }
       
       
       
       
    public static ArrayList<SensorMonitor> getObserver() throws ClassNotFoundException{
        try {
            FileInputStream fil  =  new FileInputStream("DataFiles/ObserverUsers.txt");  
            if(fil.available()>0 ){
                ObjectInputStream  oo =  new  ObjectInputStream(fil); 
                ArrayList<SensorMonitor> sr  = ( ArrayList<SensorMonitor> ) oo.readObject();
                oo.close(); 
                fil.close();;
                return sr ; 
                
            }
            
            else{
                ArrayList<SensorMonitor> sr = new ArrayList<>();
                fil.close();
                return sr ; 
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        } catch (IOException ex) {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
       
  
    }

    
     public static SetOfUsers deserializeObserver() throws IOException, ClassNotFoundException {

        SetOfUsers users;
        try (FileInputStream in = new FileInputStream("DataFiles/ObserverUsers.txt")) {
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
