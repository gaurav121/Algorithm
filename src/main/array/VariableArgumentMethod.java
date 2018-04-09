package main.array;

public class VariableArgumentMethod {

	public static void main(String[] args) {
	
		
		show();
		show(1);
		show(2,"gaurav");
		show(1,"sonu",0.5);
	
	}

	private static void show(Object ...a) {

		
		
		System.out.println();
		int n=a.length;
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}