package java8;

public class MyThread8 {

	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
		System.out.println("Hello");		
			}
		});		

Thread t2=new Thread(()-> {
			
				System.out.println("Yo");
				
			}
		);		

		

t1.start();
t2.start();
		
	}
		
	
}

