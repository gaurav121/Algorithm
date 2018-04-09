package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Generic1<V, K> {


	public V name;
	

public static void main(String[] args) {
	List a=new ArrayList<>();
	a.add("Gaurav");
	a.add(1231);
	a.add('C');
	
	
	
	for(int i=0;i<3;i++)
		System.out.println(a.get(i));

}

}

