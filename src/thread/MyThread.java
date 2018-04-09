package thread;

public class MyThread implements Runnable{

	static Integer a;
	
	public MyThread() {
	a=1;
	System.out.println("constructor called");
	}
	
	
	@Override
	public void run() {

		
		while(true){
			synchronized(a){
			try {
				a.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName()+ " "+a++ );
				
			notify();
			
			}
		
		}
	}

	
	
}
