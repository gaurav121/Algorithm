package main.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Find_inSkewedSrtted {
	
  public static void main(String args[]) throws ParseException {
	 
	int []a={7,8,9,10,1,2,3,4,5,6};
	
	int n=a.length;

	int pivot=findpivot(a,0,n-1);
	
	System.out.println("pivot is "+pivot);

	Scanner sc=new Scanner(System.in);
		while(true){
			
			System.out.println("Enter element to be searched");
			int c=sc.nextInt();
		
			int pos;
			if(c<a[0])
					pos=bsearch(a,pivot+1,n-1,c);
			else
					pos=bsearch(a,0,pivot,c);
		
			
			
			System.out.println("Found at position "+pos);
		
		}	
	
	
  }

	

		private static int bsearch(int[] a, int l, int h,int e) {

			while(l<=h)
			{
				
				int mid=(l+h)/2;
				
				if(a[mid]==e)
					return mid;
				
				if(a[mid]>e)
					l=mid-1;
				else 
					h=mid+1;
				
			}
			
			return -1;
}



		private static int findpivot(int[] a, int l,int h) {
			// TODO Auto-generated method stub
			
			

			if(l>h)
				return -1;
			
			while(l<=h)
			{
				
				int mid=(h+l)/2;
				System.out.println("lo mid and high is "+l+" "+mid+" "+h);
				
				if(a[mid]>a[mid+1])
					return mid;
				
				if(a[mid]<a[l])
					h=mid-1;
				else
					l=mid+1;
						
			
			}
			
			
			
			
			return 0;
		}
	

 
}

