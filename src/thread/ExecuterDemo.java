package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service=Executors.newFixedThreadPool(3);
		
		Future<Integer> f1=service.submit(new square());
		Future<Double> f2=service.submit(new circle());
		
		System.out.println(f1.get());
		
		service.shutdown();
		System.out.println(f2.get());
		
		Future<Integer> f3=service.submit(new square());
		
		
	}

}


class square implements Callable<Integer>{

	int  area;
	
	
	public Integer call() {
	return (int) Math.pow(3, 2);
		
	}
	
	
}


class circle implements Callable<Double>{

	int  area;
	
	
	public Double call() {
	return 3.14*3*3;
		
	}
	
	
}