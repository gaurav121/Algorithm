package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java81 {

	int age;
	String name;
	
	
	public Java81(int i, String name) {
	this.age=i;
	this.name=name;
	
	}


	public static void main(String[] args) {
		
		
		
	List<Java81> a=new ArrayList<Java81>();
		
	a.add(new Java81(21,"Gaurav"));	
	a.add(new Java81(2,"Shrav"));
	a.add(new Java81(12,"Ram"));	
	a.add(new Java81(41,"Sonu"));	
	a.add(new Java81(89,"Aarav"));	
	
	sysout(a);
	
	sortbyname7(a);
	
	sysout(a);
	
	sortbyID7(a);
	
	sysout(a);
	
	sortbyname8(a);
	
	sysout(a);
	
	
	
		
	}


	
/*	void sortbyID8(List<Java81> a) {
		Collections.sort(a,(s1,s2)->s1.age-s2.age)
	}
*/	
	
	
	private static void sortbyname8(List<Java81> a) {
	
		Collections.sort(a,(s1,s2)->s1.name.compareTo(s2.name));
		
	}


	private static void sysout(List<Java81> a) {

		System.out.println("\nList is ");
		
		for(int i=0;i<a.size();i++) {
			
			System.out.println(a.get(i).age+" "+a.get(i).name);
			
		}
		
		
	}


	private static void sortbyname7(List<Java81> a) {
		 Collections.sort(a, new Comparator<Java81>() {
	        

			@Override
			public int compare(Java81 o1, Java81 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
	      });
		
	};
	
	
	
	public static void sortbyID7(List<Java81> a) {
		Collections.sort(a, new Comparator<Java81>() {

			@Override
			public int compare(Java81 o1, Java81 o2) {
				// TODO Auto-generated method stub
				return o1.age-o2.age;
			}
		});
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
}
