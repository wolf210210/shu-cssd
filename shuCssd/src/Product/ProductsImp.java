package Product;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductsImp implements Serializable {

    private static final long serialVersionUID = -47594027994670654L;
    private static int productCount = 0;
    private int productNumber, stockNo;
    private String name, description;
    private String state,aval;
    private int productID;
    private double uprice,totqty;
//    private byte[] image;

    List<productObserver> observerList = new ArrayList<productObserver>();

    public ProductsImp() {
    }

    public ProductsImp(String name, String des,double totqty, double uprice,String avalability) {
        super();
        this.name = name;
        this.totqty= totqty;
        this.aval= avalability;
        this.uprice= uprice;
        this.description = des;
//        this.image=image;
        productNumber = ++productCount;

    }

    

 

//    @Override
//    public void setStatus(String status) {
// if(status.equals("Yes"))
//        {
//        this.state = status;
//            notifyObservers();
//        }
//        else
//        {
//            notifyObserversRemove();
//            System.out.print("edgeg");
//    
//        }
//    }

    
//    @Override
    public String getStatus() {
        return this.state;
    }

  

    
    public String getName() {

        return name;
    }

 
   public double getPrice() {
        return uprice;
    }

    public double getQuantity() {
        return totqty;
    }

    public String getAvalability() {
        return aval;
    }

  
    public String getdescription() {
        return description;
    }
    
//    public byte[] getImage()
//    {
//        return image;
//    }

  
    public void setName(String name) {
        this.name = name;
    }

//    public void setImage(byte[] image)
//    {
//        this.image=image;
//    }
   
   
    public void setDescription(String des) {
        this.description = des;

    }

//    @Override
    public void setPrice(double price) {
        this.uprice = price;
    }

//    @Override
    public void setQuantity(double qty) {
        this.totqty = qty;
    }

    public void setAvalability(String avl) {
        this.aval = avl;
    }
  
    public int getProductNo() {
        return productNumber;
    }

  
    public void setProductNo(int productNumber) {
        this.productNumber = productNumber;
    }
    
//    @Override
    public void print() {
    System.out.println(productNumber+" "+name+"File deserilized");
    }
  @Override
    public String toString() {
        return Integer.toString(productNumber) + " " + name;
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
   
    
}
