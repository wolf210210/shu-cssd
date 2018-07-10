/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emergencyclasses;

/**
 *
 * @author wolf
 */
public interface SensorStation {
    public void registerObserver(Mothership motherShip );
    public  void unregisterObserver(Mothership motherShip );
    public  void notifyObservers();  
    public void setStatus(String status);
    public String getStatus();

}
