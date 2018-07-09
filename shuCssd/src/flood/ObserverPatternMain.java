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
public class ObserverPatternMain {
    
   public static void main(String[] args) {
    MothershipImp arpitPerson=new MothershipImp("Arpit");
    MothershipImp johnPerson=new MothershipImp("John");
    MothershipImp piyumiPerson=new MothershipImp("piyumi");
    
    SensorMonitor samsungMobile=new SensorMonitor("Samsung", "Mobile", "Not available");
    SensorMonitor notMobile=new SensorMonitor("NOT", "Mobile", "Not available");
    
    //When you opt for option "Notify me when product is available".Below registerObserver method
    //get executed   
    samsungMobile.registerObserver(arpitPerson);
    samsungMobile.registerObserver(johnPerson);
    notMobile.registerObserver(piyumiPerson);
    
    //Now product is available
    //samsungMobile.setAvailability("Available");
    notMobile.setAvailability("Available");
   }
}
