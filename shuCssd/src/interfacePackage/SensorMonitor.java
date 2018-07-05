/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author wolf
 */
public class SensorMonitor implements SensorStation ,Serializable{
    
    private ArrayList<Mothership> mothership;
    private  double location  ; 
    
    private Sensor  aSensor;

    public SensorMonitor(){
        mothership = new ArrayList<Mothership>();
        aSensor = new Sensor();
    }
    
    @Override
    public void registerObserver(Mothership newMothership) {
      mothership.add(newMothership);
    }

    @Override
    public void unregisterObserver(Mothership deleteMothership) {
        int mothershipIndex = mothership.indexOf(deleteMothership);
        System.out.println("observer" + (mothershipIndex) + "deleted");
        mothership.remove(mothershipIndex);
    }

    @Override
    public void notifyObservers() {
//          Iterator<Mothership> iterator = mothership.iterator();
        for(Mothership observer : mothership){
            observer.update(location);
        }
    }
    
    public void setLocation(double newLoacation ){
        this.location =newLoacation;
        notifyObservers();
    }
    
}
