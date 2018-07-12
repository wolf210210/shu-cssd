/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Piyu
 */
public class Sensor implements Serializable{
    private static final long serialVersionUID = -47594027994670654L;
    private static int sensor = 0;
    private int sensorNumber, stockNo;
    private String name, description;
    private String state , availability;
    private double frequency;
    
    Data readingA ;
    
    
    public Sensor() {
    }
    
      public Sensor(String name, String des,double frequency, String pState) {
        super();
        this.name = name;
        this.frequency= frequency;
  
        this.description = des;
        this.state = pState; 
        sensorNumber = ++sensor;

    }
      
       public void setName(String name) {
        this.name = name;
    }
       
       public void setDescription(String des) {
        this.description = des;

    }
       
         
    public int getSensorNo() {
        return sensorNumber;
    }
    
      public String getName() {

        return name;
    }
      
         
            public void setfrequency(double frq) {
        this.frequency = frq;
    }

            
            
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(sensor);
       

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        sensor = (Integer) ois.readObject();
    
    }
    
    
    public double getfrequency() {
        return frequency;
    }
    
    public String getStatus() {
        return this.state;
    }
    


       public String getdescription() {
        return description;
    }
       
       
    private Data getData(){
        readingA =new  Data();
        return readingA;
    }
    
    public String getID(String sensorID){
        return sensorID;
    }

    void update(String availabilitys) {
        this.availability = availabilitys;
    }
    
}
