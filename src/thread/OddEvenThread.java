/**
 * 
 */
package thread;

import java.util.ArrayList;

/**
 * @author Praful Jha
 *
 */
public class OddEvenThread {

	
	
	
	
	static OddEvenThread oddEven = new OddEvenThread();
	int start = 1;
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					oddEven.printOddNumbers();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				try {
					oddEven.printEvenNumbers();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		
	/*	t1.join();
		t2.join();
		*/
		
	}
	
	public void printOddNumbers() throws InterruptedException {
	
		System.out.println("in ptrin"+Thread.currentThread().getName());
		while(true) {
			
			synchronized (this) {
				
				System.out.println(Thread.currentThread().getName()+" "+start++);
				wait();
				//notify();
			}
		}
	}
	
	public void printEvenNumbers() throws InterruptedException {
		System.out.println("in ptrin"+Thread.currentThread().getName());
			
		while(true) {
			
			Thread.sleep(1000);
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+" "+start++);
				notify();
			}
		}
	}
	
}
