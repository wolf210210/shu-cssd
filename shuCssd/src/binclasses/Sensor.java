/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author wolf
 */
public class Sensor  implements Serializable{
    
    private static final long serialVersionUID = -47594027994670654L;
    private static int sensor = 0;
    private int sensorNumber, stockNo;
    private String name, description;
    private String state;

    private double frequency;
    
    /**
     *
     */
    public Sensor() {
    }
    
    /**Sensor
     * constructor 
     * @param name
     * @param des
     * @param frequency
     * @param pState
     */
    public Sensor(String name, String des,double frequency, String pState) {
        super();
        this.name = name;
        this.frequency= frequency;
  
        this.description = des;
        this.state = pState; 
//        this.image=image;
        sensorNumber = ++sensor;

    }
      
    /**setName
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
       
    /**setDescription
     *
     * @param des
     */
    public void setDescription(String des) {
        this.description = des;

    }
       
    /**getSensorNo
     *
     * @return
     */
    public int getSensorNo() {
        return sensorNumber;
    }
    
    /**getName
     *
     * @return name
     */
    public String getName() {

        return name;
    }

    /**setfrequency
     *
     * @param frq
     */
    public void setfrequency(double frq) {
        this.frequency = frq;
    }

            
               //transient and static fields are write and read
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
    
    /**
     *
     * @return
     */
    public double getfrequency() {
        return frequency;
    }
    
    /**
     *
     * @return
     */
    public String getStatus() {
        return this.state;
    }
    
    /**
     *
     * @param states
     */
    public void setStatus(String states){
        this.state = states;
    }

    /**
     *
     * @return
     */
    public String getdescription() {
        return description;
    }
 

   
  
}
