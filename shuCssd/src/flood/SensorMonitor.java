/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Piyu
 */
public class SensorMonitor extends Vector<Sensor> implements SensorStation,Serializable {
    
    private static final long serialVersionUID = 2428035439452881234L;
    SensorMonitor monitorSet;
    private ArrayList<Mothership> observers = new ArrayList<Mothership>();
     public  Clock clock ;
    private String productName;
    private String productType;
    String availability;
    
    private String SensorMonitorID;
    private ArrayList<Double> coords;
    Data Reading; 
    

    
    public SensorMonitor() {
        super();
        clock = Clock.getInstance();
     }
     
//    
//	public SensorMonitor(String productName, String productType,String availability) {
//		super();
//		this.productName = productName;
//		this.productType = productType;
//		this.availability=availability;
//	}
//	
	public ArrayList<Mothership> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Mothership> observers) {
		this.observers = observers;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public void notifyObservers() {
		System.out.println("Notifying to all the subscribers when product became available");
		 for (Mothership ob : observers) {
             ob.update(this.availability );
      }

	}

	public void registerObserver(Mothership observer) {
		 observers.add(observer);
		
	}

	public void removeObserver(Mothership observer) {
		 observers.remove(observer);
		
	}

    @Override
    public void setStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
     String personName;

	public SensorMonitor(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void update(String availabiliy) {
		
		System.out.println("Hello "+personName+", Product is now "+availabiliy+" on flipkart");
	}
        
        
        
        public void doTick(){
            
        }
        
        private void ShouldTakeReading(){
            
        }
        
       public void embllishedData(){
            
        }
        
      
    
}
