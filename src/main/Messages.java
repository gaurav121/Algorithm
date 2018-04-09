package main;

import java.util.ResourceBundle;

public class Messages {
	
	String name;
	
	
	@Override
	public boolean equals(Object O){
		
		System.out.println("Hello");
		if( O instanceof Messages &&   this.name==((Messages)O).name)
		return true;
			
		return false;
		
		
		
	}
}
