package practice.Algorithm;

import java.util.HashMap;
import java.util.HashSet;

public class CheckDuplicateWithinK {

	public static void main(String [] args) {
	
		
		System.out.println("Array lengthy "+args.length);
		int k;
		//k=Integer.parseInt(args[0]);
		//System.out.println(args[0]);
		k=3;
		int[] a= {1,2,3,1,5,1,6,7,1,8,9};
		
		
		HashMap<Integer,Integer> map=new HashMap<>();
		int i,start=0;
		
		for(i=0;i<k;i++)
			map.put(a[i], 1);
		

		//easiest way is n*k time with two loops 
		for(i=k;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
				System.out.println("Duplicate found "+a[i]+" at position"+i);
			}else {
				if(map.containsKey(a[i-k-1]))
				map.put(a[i-k-1],map.get(a[i-k-1])-1);
				else
					map.put(a[i-k-1], 1);

				if(map.get(a[i-k-1])==0)
				map.remove(a[i-k-1]);
				}
		}
		
		System.out.println("Duplication calculation ends"+checkDuplicatesWithinK(a, k));
		
		
	}

	static boolean checkDuplicatesWithinK(int arr[], int k)
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If already present n hash, then we found 
            // a duplicate within k distance
            if (set.contains(arr[i]))
               return true;
 
            // Add this item to hashset
            set.add(arr[i]);
 
            // Remove the k+1 distant item
            if (i >= k)
              set.remove(arr[i-k]);
        }
        return false;
    }

}
