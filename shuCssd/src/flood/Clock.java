/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flood;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import userclasses.User;

/**
 *
 * @author Piyu
 */
public class Clock extends Thread{
  
    

    private String productNames;
    
  
    private static final long serialVersionUID = 2428035439452881234L;
        
    private static Clock instance = null;

    private ArrayList<SensorMonitor> observers;
     private ArrayList<User> userObservers;
   private Thread t;
   private  static String threadName;
    String availability;
    
    public Clock() {
     observers = new ArrayList<SensorMonitor>();
    }
    
      public static Clock getInstance() {
      if (instance == null) {
                instance = new Clock();

	}
        return instance;
    }

    Clock(String thread1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     

    public void notifyObservers() {
       System.out.println("Notifying all the subscribers");
		 for (SensorMonitor ob : observers) {
                            ob.doTick();
                 }


	}

	public void registerObserver(SensorMonitor observer) {
		 observers.add(observer);
		
	}

	public void unregisterObserver(SensorMonitor observer) {
		 observers.remove(observer);
		
	}
        
        
        
        public void tractTime(){
            
        }
        
        public void waitForTime(){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
        }
        
        public void notifyAllObservers(){
            
        }
        
        public long mills(long timeInMiles){
                 return timeInMiles;
        }
        
       
        public void run() {
      System.out.println("Running " +  threadName );
      while (true) {
          System.out.println("Thread Notifying" );
          // Let the thread sleep for a while.
          notifyObservers();
          waitForTime();
      }
      
   }
        
        
        
        
}
