/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author wolf
 */
public class Serializationss {
    
    public static void Serialize(Object object, String filename) throws IOException {

		FileOutputStream out = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(object);
		oos.flush();
		out.close();
            
	}
    
//    public static SetOfMembers deserializeMembers(String filename)throws IOException, ClassNotFoundException {
//
//		FileInputStream in = new FileInputStream(filename);
//		ObjectInputStream ois = new ObjectInputStream(in);
//		SetOfMembers members = (SetOfMembers) ois.readObject();
//		in.close();
//             
//		return members;
//	}
//    
//    
//    public static SetOfBooks deserializeBooks(String filename)throws IOException, ClassNotFoundException {
//
//		FileInputStream in = new FileInputStream(filename);
//		ObjectInputStream ois = new ObjectInputStream(in);
//		SetOfBooks books = (SetOfBooks) ois.readObject();
//		in.close();
//                
//		return books;
//	}
}
