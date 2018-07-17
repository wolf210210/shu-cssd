/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;





import GUI.EmbellishedDataMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author wolf
 */
public class SensorMonitor extends Vector<Sensor> implements  SensorStation , Serializable {

            private static final long serialVersionUID = 2428035439452881234L;
            SensorMonitor monitorSet;
            SensorMonitor monitorSetPass;
            EmbellishedDataMap embellishedDataMap ;
            Location sensorLocation;
            List<Mothership> observerList = new ArrayList<Mothership>();
            String availability;

    /**
     *
     */
    public  Clock clock ;
             private static int sensorMonitorNoCount = 0;
             private int sensorMonitorNo ;
               private  EmbellishedData   embellishedData ; 
     
    /**
     *
     */
    public SensorMonitor() {
        super();
//      clock = Clock.getInstance();
//       clock.registerObserver(monitorSet);
    }
    
  
//    

    /**updateSensors
     * constructor 
     * @param aSensor
     * @param Name
     * @param description
     * @param frequency
     * @param states
     * @return
     */

    
    public String updateSensors(Sensor aSensor, String Name, String description , Double frequency , String  states) {
        String status = "";
        try {
            
            this.elementAt(this.indexOf(aSensor)).setName(Name);
            this.elementAt(this.indexOf(aSensor)).setDescription(description);
            this.elementAt(this.indexOf(aSensor)).setfrequency(frequency);
            this.elementAt(this.indexOf(aSensor)).setStatus(states);
            
            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }
    
    /**getSensorFromID
     * Once sensor number is given return object of the sensor
     * @param number
     * @return monitorSet
     */
    public SensorMonitor getSensorFromID(int number) {
        
        monitorSet = new SensorMonitor();
        for (Sensor sensor : this) {
            if (sensor.getSensorNo() == number) {
                monitorSet.addNewSensor(sensor);
                
            }
        }
        return monitorSet;
    }
    
    /**getSensorFromName
     *  Once sensor name provide, return object of the sensor 
     * @param name
     * @return monitorSet
     */
    public SensorMonitor getSensorFromName(String name) {
        
        monitorSet = new SensorMonitor();
        for (Sensor sensor : this) {
            if (sensor.getName().toLowerCase().contains(name.toLowerCase())) {
                monitorSet.addNewSensor(sensor);
                
            }
        }
        return monitorSet;
    }
    
    /**addNewSensor
     *
     * @param aSensor
     */
    public void addNewSensor(Sensor aSensor){
          super.add(aSensor);
    }
    
//    public void addNewSensorLocation (int sensorID, Double latitudes, Double longitudes ) {
//         
//          sensorLocation = new Location(latitudes ,longitudes,sensorID);
//          
//    }
 
    /**
     *
     * @param status
     */
    @Override
    public void setStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**setAvailability
     *
     * @param availabilitys
     */
    public void setAvailability(String availabilitys) {
		this.availability = availabilitys;
		notifyObservers();
    }

    /**registerObserver
     *
     * @param motherShip
     */
    @Override
    public void registerObserver(Mothership motherShip) {
         observerList.add(motherShip);
    }

    /**unregisterObserver
     *
     * @param motherShip
     */
    @Override
    public void unregisterObserver(Mothership motherShip) {
              observerList.remove(motherShip);
    }

    /**notifyObservers
     *
     */
    @Override
    public void notifyObservers() {
       System.out.println("Notifying all the subscribers when the bin is full");
		 for (Mothership ob : observerList) {
             ob.update(this.availability);
                   
      }
    }
    
      

    /**remove
     * once sensor object given, remove sensor 
     * @param sen
     * @return true/false  
     */
     public boolean remove(Sensor sen) {
        return super.remove(sen);
    }
    
    /**doTick
     * Check all the sensors where frequency is higher than 100 and break the loop and call  EmbellishedDataMap method
     */
    public void doTick(){
          monitorSetPass = new SensorMonitor();
          
            for (Sensor sensor : this) {
                    if (sensor.getfrequency() > 100) {
                           embellishedDataMap = new EmbellishedDataMap();
                           embellishedDataMap.setVisible(true);
                           System.out.println("awa");
                           break;
                           
                     
                    }
        }
        
            
     }
}
