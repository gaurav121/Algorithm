package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadODDEVEN {

	static int counter=1;
	static ThreadODDEVEN oddeven=new ThreadODDEVEN();	
	public static void main(String[] args) {
	
		
	 MyThread t1=new MyThread();


	 MyThread t2=new MyThread();
	
	
	 Thread even=new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			try {
				oddeven.printeven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	});
	
	 Thread odd=new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				oddeven.printodd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}

		
	});
	
	
	 	
		odd.start();
		even.start();
		
		
	}
	
	private  void printodd() throws InterruptedException {
		// TODO Auto-generated method stub
			
		
		while(true){
			
			
			Thread.sleep(1000);
		synchronized (this) {
			
			//System.out.println(Thread.currentThread().getName()+" "+counter++);
			System.out.println(Thread.currentThread().getName()+" a");
			wait();
		
		}	
	}
		
	}
	
	
	private  void printeven() throws InterruptedException {
		
		while(true){
		
			Thread.sleep(1000);
			
		synchronized (this) {
			
			//System.out.println(Thread.currentThread().getName()+" "+counter++);
			System.out.println(Thread.currentThread().getName()+" b");
			notify();
			
		}
		
		}
		
		// TODO Auto-generated method stub
		
	}
	

}
