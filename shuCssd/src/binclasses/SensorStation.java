/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;

/**
 *
 * @author wolf
 */
public interface SensorStation {
    public void registerObserver(Mothership sensorStation );
    public  void unregisterObserver(Mothership sensorStation );
    public  void notifyObservers();
    
     public void setStatus(String status);

    public String getStatus();
    
    public void setPrice(double price);

    public double getPrice();
    
     public void setQuantity(double quantity);

    public double getQuantity();
   
    public void print();
}
