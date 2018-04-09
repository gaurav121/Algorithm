package main.array;


//Positive elements at even and negative at odd positions

public class PositiveElements_even_negative_odd_positions {

	
	
	public static void main(String[] args) {
		
		
		int arr[] = {-1, 3, -5, 6, 3, 6, -7, -4, -9, 10};
		
		
		int odd=1,even=0,n=arr.length;
		
		
		while(odd<n && even<n){
			System.out.println("heere"+odd);
			
			
			while(odd<n && arr[odd]<0){				
		
			//	System.out.println("heere,sdffn"+odd);
				odd+=2;
				
			}
			
			//System.out.println("now odd is "+odd);
			
			if(odd>=n)
				break;
			
			while(even<n && arr[even]>0)
			even+=2;

//			System.out.println("now even is "+even);
			
		
			if(odd<n && even<n)swap(arr,odd,even);
			
		}
		
		
		
		for(int i=0;i<n;i++){
			
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

	private static void swap(int[] arr, int odd, int even) {

		int t=arr[odd];
		arr[odd]=arr[even];
		arr[even]=t;
		
		
	}
}
