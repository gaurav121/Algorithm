package main.array;

public class Count_distctNoSumInArray {

	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5, 10};
		int n=arr.length;
		
		int i,j;
		
		int max=0;
		
		//System.out.println("here");
		for(i=0;i<n;i++)
			if(arr[i]>max)
				max=arr[i];
		
		max=max*2+1;
		
		int map[]=new int[max];
		for(i=0;i<n;i++)
			map[arr[i]]++;
			
		//System.out.println(max);
		int count=0;
		
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++){
				//System.out.println(arr[i]+arr[j]);
				if(map[arr[i]+arr[j]]>0)
				count++;
				
			}
		}
		
	System.out.println(count);
	
	}
}
