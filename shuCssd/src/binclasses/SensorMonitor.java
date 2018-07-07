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
public class SensorMonitor extends Vector<Sensor>implements  SensorStation , Serializable {

            private static final long serialVersionUID = 2428035439452881234L;
            SensorMonitor monitorSet;
            List<Mothership> observerList = new ArrayList<Mothership>();
     
     
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
                monitorSet.registerObserver(sensor);
                
            }
        }
        return monitorSet;
    }
    
    public SensorMonitor getSensorFromName(String name) {
        
        monitorSet = new SensorMonitor();
        for (Sensor sensor : this) {
            if (sensor.getName().toLowerCase().contains(name.toLowerCase())) {
                monitorSet.registerObserver(sensor);
                
            }
        }
        return monitorSet;
    }
    
 
    

    @Override
    public void setStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void registerObserver(Mothership sensorStation) {
        
    }

    @Override
    public void unregisterObserver(Mothership sensorStation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      
    public void registerObserver(Sensor aSensor) {
        super.add(aSensor);
    }
    
      public boolean unregisterObserver(Sensor sen) {
         return super.remove(sen);
    }
    
}
