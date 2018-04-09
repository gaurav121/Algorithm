package practice.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortArrayOnFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a= {"A","B","C","D","E","A","B","C","E","B","C","E","B","E","E"};
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i]))				
			map.put(a[i],map.get(a[i])+1);
			else
			map.put(a[i], 1);
		}
		
/*		map.put("A", 1);
		map.put("A", 1);
		map.put("D", 4);
		map.put("D", 4);
		map.put("D", 4);
		map.put("D", 4);
		map.put("D", 4);
		map.put("F", 6);
		map.put("C", 3);
		map.put("C", 3);
		map.put("C", 3);
*/
		
		
		
		List<Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
		System.out.println(list);
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

			
		});
		
		
		System.out.println(list);
		
	
		//using treeMap
		
		TreeMap<String,Integer> tmap=new TreeMap<String,Integer>();
		for(int i=0;i<a.length;i++){
			if(tmap.containsKey(a[i]))				
			tmap.put(a[i],tmap.get(a[i])+1);
			else
			tmap.put(a[i], 1);
		}
		
		
		Iterator itr=tmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry e=(Entry) itr.next();
			System.out.println("Key"+e.getKey()+" vlaue "+e.getValue());
			
			
			
		}
		
		
	}

}
