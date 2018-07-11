/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;





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
            Location sensorLocation;
            List<Mothership> observerList = new ArrayList<Mothership>();
            String availability;
      
     
    public SensorMonitor() {
        super();
    }
//    

    public String updateSensors(Sensor aSensor, String Name, String description) {
        String status = "";
        try {
            
            this.elementAt(this.indexOf(aSensor)).setName(Name);
            this.elementAt(this.indexOf(aSensor)).setDescription(description);
           
            
            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }
    
    public SensorMonitor getSensorFromID(int number) {
        
        monitorSet = new SensorMonitor();
        for (Sensor sensor : this) {
            if (sensor.getSensorNo() == number) {
                monitorSet.addNewSensor(sensor);
                
            }
        }
        return monitorSet;
    }
    
    public SensorMonitor getSensorFromName(String name) {
        
        monitorSet = new SensorMonitor();
        for (Sensor sensor : this) {
            if (sensor.getName().toLowerCase().contains(name.toLowerCase())) {
                monitorSet.addNewSensor(sensor);
                
            }
        }
        return monitorSet;
    }
    
    public void addNewSensor(Sensor aSensor){
          super.add(aSensor);
    }
    
//    public void addNewSensorLocation (int sensorID, Double latitudes, Double longitudes ) {
//         
//          sensorLocation = new Location(latitudes ,longitudes,sensorID);
//          
//    }
 
    

    @Override
    public void setStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAvailability(String availabilitys) {
		this.availability = availabilitys;
		notifyObservers();
    }

    @Override
    public void registerObserver(Mothership motherShip) {
         observerList.add(motherShip);
    }

    @Override
    public void unregisterObserver(Mothership motherShip) {
              observerList.remove(motherShip);
    }

    @Override
    public void notifyObservers() {
       System.out.println("Notifying to all the subscribers when product became available");
		 for (Mothership ob : observerList) {
             ob.update(this.availability);
                   
      }
    }
    
      
//    public void registerObserver(Sensor aSensor ) {
//        super.add(aSensor);
//    }
//    
    public boolean unregisterObserver(Sensor sen) {
         return super.remove(sen);
    }
    
}
