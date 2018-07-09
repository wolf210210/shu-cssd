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
public class MothershipImp implements Mothership {
     String personName;

	public MothershipImp(String personName) {
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
        
        
}
