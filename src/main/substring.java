package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class substring{
	
	public static Set<String> result =new TreeSet<>();
	

	int ttt=99;
	void ll(){
		System.out.println("sun=bs"+ttt);
	}

	
	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		
		String t=sc.nextLine();
		
		
		int l=t.length();
		
		for(int j=1;j<=l;j++){
			getstring(t,l,j);
		}
	
		
		System.out.println(result);
		System.out.println(result.size());
		
		
	}

	private static void getstring(String t, int n,int j) {

	
		for(int i=0;i<(n-j+1);i++){
			
			//print str from i to t string 
			String temp= t.substring(i, (i+j));
			
			
			result.add(temp);
			
		}
		
		
		
	}
	
}