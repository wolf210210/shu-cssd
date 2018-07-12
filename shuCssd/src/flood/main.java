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
public class main {
     public static void main(String[] args) {
    SensorMonitor arpitPerson=new SensorMonitor("arpit");
    SensorMonitor johnPerson=new SensorMonitor("John");
    SensorMonitor piyumiPerson=new SensorMonitor("piyumi");
    
    Clock samsungMobile =new Clock("Samsung", "Mobile","available");
    Clock notMobile=new Clock("NOT", "Mobile", "available");
    
    //When you opt for option "Notify me when product is available".Below registerObserver method
    //get executed   
    samsungMobile.registerObserver(arpitPerson);
    samsungMobile.registerObserver(johnPerson);
    notMobile.registerObserver(piyumiPerson);
    
    //Now product is available
   // samsungMobile.setAvailability("Available");
    notMobile.setAvailability("Available");
}
}
