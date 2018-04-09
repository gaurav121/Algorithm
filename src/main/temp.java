package main;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;



public class temp{
	
	
	static int sta;
	
	public temp(int t) {
		sta=t;
	}
	
	

	public static void main(String args[]) throws InterruptedException, IOException{
		

		temp t=new temp(12);
		temp t2=new temp(19);
		System.out.println(t.sta);
		System.out.println(t2.sta);
	String a=null;
	
	

	System.out.println(a.equals(null));
	
	}
	
	
	
	
}