/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

/**
 *
 * @author Piyu
 */
public interface SensorStation {
    public void registerObserver(Mothership observer);
    public void removeObserver(Mothership observer);
    public void notifyObservers();
     public void setStatus(String status);
    public String getStatus();
}
