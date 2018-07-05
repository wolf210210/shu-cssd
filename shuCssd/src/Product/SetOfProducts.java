package Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Lakmi
 */
public class SetOfProducts extends Vector<ProductsImp> implements Products , Serializable {
    
    private static final long serialVersionUID = 2428035439452881234L;
    SetOfProducts productSet;
     List<productObserver> observerList = new ArrayList<productObserver>();
    public SetOfProducts() {
        super();
    }
    
    public void addProducts(ProductsImp aProduct) {
        super.add(aProduct);
    }
    
    public String updateProducts(ProductsImp aProduct, String Name, String description) {
        String status = "";
        try {
            
            this.elementAt(this.indexOf(aProduct)).setName(Name);
            this.elementAt(this.indexOf(aProduct)).setDescription(description);
           
            
            status = "success";
        } catch (Exception ex) {
            status = "fail";
        }
        return status;
    }
    
    public SetOfProducts getProductFromID(int number) {
        
        productSet = new SetOfProducts();
        for (ProductsImp product : this) {
            if (product.getProductNo() == number) {
                productSet.addProducts(product);
                
            }
        }
        return productSet;
    }
    
    public SetOfProducts getProductFromName(String name) {
        
        productSet = new SetOfProducts();
        for (ProductsImp product : this) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                productSet.addProducts(product);
                
            }
        }
        return productSet;
    }
    
    
    @Override
    public void registerObserver(productObserver observer) {
           observerList.remove(observer);
    }

    @Override
    public void removeObserver(productObserver observer) {
       observerList.remove(observer);
    }

    @Override
    public void setStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQuantity(double quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
