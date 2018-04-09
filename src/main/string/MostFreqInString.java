package main.string;

import java.util.HashMap;

public class MostFreqInString {
public static void main(String[] args) {
	
	
	String a[]= {"geeks", "for", "geeks", "a", 
            "portal", "to", "learn", "can",
            "be", "computer", "science", 
             "zoom", "yup", "fire", "in", 
             "be", "data"};
	
	HashMap<String, Integer> map=new HashMap<>();
	int n=a.length;
	
	int max=0;
	String maxval = null;
	
	for(int i =0;i<n;i++){
		
		if(map.containsKey(a[i])){
			int val=map.get(a[i]);
			map.replace(a[i], val+1);
		   if(val+1>max){
				max=val+1;
			    maxval=a[i];
			}
		}
		else 
			{
			map.put(a[i], 1);
			
			}
		
	}
	

System.out.println("Val is "+maxval+" "+max);	

System.out.println(map.entrySet());
}
}
