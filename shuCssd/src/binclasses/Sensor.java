/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author wolf
 */
public class Sensor  implements Serializable{
    
       private static final long serialVersionUID = -47594027994670654L;
    private static int productCount = 0;
    private int productNumber, stockNo;
    private String name, description;
    private String state,aval;
    private int productID;
    private double uprice,totqty;
    
    
    public Sensor() {
    }
    
      public Sensor(String name, String des,double totqty, double uprice,String avalability) {
        super();
        this.name = name;
        this.totqty= totqty;
        this.aval= avalability;
        this.uprice= uprice;
        this.description = des;
//        this.image=image;
        productNumber = ++productCount;

    }
      
       public void setName(String name) {
        this.name = name;
    }
       
       public void setDescription(String des) {
        this.description = des;

    }
       
         
    public int getProductNo() {
        return productNumber;
    }
    
      public String getName() {

        return name;
    }
      
       public void setAvalability(String avl) {
        this.aval = avl;
    }
       
         public void setPrice(double price) {
        this.uprice = price;
    }
         
            public void setQuantity(double qty) {
        this.totqty = qty;
    }

            
               //transient and static fields are write and read
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(productCount);
       

    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        productCount = (Integer) ois.readObject();
    
    }
    
    
    public double getQuantity() {
        return totqty;
    }
    
    public String getStatus() {
        return this.state;
    }
    
    public double getPrice() {
        return uprice;
    }

       public String getdescription() {
        return description;
    }
       
        public String getAvalability() {
        return aval;
    }

   
  
}
