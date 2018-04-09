package main;


//eager
public class Singleton1 {

	private static Singleton1 instance =new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance(){
		return instance;
	}
}

//lazy
 class Singleton2 {

	private static Singleton2 instance = null;
	
	private Singleton2() {}
	
	
	
	
	public static Singleton2 getInstance(){
		if(instance==null)
		instance = new Singleton2();
	
		String a="w1e3";
		
		switch(a){
		
		
		}
		
		return instance;
	}
}





