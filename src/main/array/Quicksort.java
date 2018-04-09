package main.array;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		
		int a[]={2,3,4,1,6,4,7};
		int n=a.length;
		
		System.out.println("wqek");
		
		//quicksort(a,0,n-1);
		Arrays.sort(a);
		showarray(a);

			
		
		
		
	}

	private static void quicksort(int[] a, int l, int h) {

		if(l>=h)
			return;
		
		
		System.out.println("w4r");
		int p=partition1(a, l, h);
		
		quicksort(a, l, p-1);
		quicksort(a, p+1, h);
		
		
		
	}

	private static void showarray(int[] a) {
	
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		
	}

	private static int partition1(int array[], int first, int last) {
		  
	    int x = array[first];
	    
	    int i = first - 1;
	    
	    int j = last + 1;
	    
	    while (true) {
	    
	      do {
	        j--;
		
	      } while (array[j] > x);
	      
	      do  {
	        
		i++;
		
	      } while (array[i] < x);
	      
	      if ( i < j ) {
	      
	        int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
		
	      }
	      
	      else
	      
	        return j;
	    }
	  }
	
	private static int partition(int[] a, int l, int h) {
		
		int pivot=l;
		l=l+1;
		System.out.println("pivot is "+a[pivot]);
		System.out.println("before array");
		showarray(a);;
		
		while(l<h){
			
			while(l<=h && a[l]<a[pivot])
				l++;
			
			while(l<h && a[h]>a[pivot])
				h--;
			
			if(l<h)
				//swap(a[l],a[h]);
			{
				int t=a[l];
				a[l]=a[h];
				a[h]=t;	
			}
			else 
				{
					int t=a[pivot];
					a[pivot]=a[h];
					a[h]=t;
				
				
				}
			
			
		}

		System.out.println("after  array");
		showarray(a);;

		return h;
	}

	private static void swap(int i, int j) {
		
		int t=i;
		i=j;
		j=t;
		
		
	}
	
	
}
