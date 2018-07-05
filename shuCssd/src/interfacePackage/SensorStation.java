/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

/**
 *
 * @author wolf
 */
public interface SensorStation {
    public void registerObserver(Mothership sensorStation );
    public  void unregisterObserver(Mothership sensorStation );
    public  void notifyObservers();
}
