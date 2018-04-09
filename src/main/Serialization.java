package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization{

	/**
	 * 
	 */
	
	/**
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * 
	 */

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*FileOutputStream stream = null;
		try {
			stream = new FileOutputStream("C:/Users/gyadav/Desktop/testnewfile.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectOutputStream stream2 = null;
		try {
			stream2 = new ObjectOutputStream(stream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			stream2.writeObject(new myserialised());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			stream2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		FileInputStream fileInputStream=new FileInputStream("C:/Users/gyadav/Desktop/testnewfile.txt");
		ObjectInputStream instream=new ObjectInputStream(fileInputStream);
		
		System.out.println(instream.readObject());
		
		fileInputStream.close();
		instream.close();
		
		
	}
	
	
	
}


class myserialised implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2138422862025823600L;
	int a;
	String t;
	
	
	public myserialised() {

	t="gaurav";
	a=12;
	
	}
	
	
	
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.t+" "+this.a;
	}	
	
	
	
	
}

