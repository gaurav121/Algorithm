package main.array;



//Remove array end element to maximize the sum of product



public class Remove_array_end_elementRemove {

	
		
	
	public static void main(String[] args) {
		
		int a[]={ 1, 3, 1, 5, 2 };
		
		
		/*
		int l=0;
		int r=a.length-1;
		int product=0;
		int count=1;
		while(l<=r){
			
			if(a[l]<=a[r]){
				product+=a[l]*count;
				System.out.println("taking l out "+a[l]);
				
				l++;
			}
			else
			{
				product+=a[r]*count;
				System.out.println("taking r out "+a[r]);
				r--;
			}
			
			count++;
			
		System.out.println("Product is "+product);
		}
		
		
		*/
		
		System.out.println(findmax(a,0,a.length-1,1));
		
		
		
	
		
		
	}

	private static int findmax(int[] a, int l, int r, int counter) {

		
		for(int j=l;j<=r;j++)
		{
			
			System.out.print(a[j]+" ");
		}

		
		System.out.println("stack is "+" "+l+" "+r+" "+counter);
		
		if(l==r)
			return a[l]*counter;
		else if (l>r)
			return 0;
		
		 int mm= max(findmax(a,l+1,r,counter+1)+a[l]*counter,  
			    	findmax(a,l,r-1,counter+1)+a[r]*counter);
			
		 System.out.println("max here is "+mm);
		 return mm;
}

	private static int max(int i, int j) {
		
		return i>j?i:j;
	}
	
}