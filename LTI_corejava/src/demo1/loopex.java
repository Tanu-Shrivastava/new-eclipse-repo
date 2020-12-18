package demo1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class loopex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Monday");
		hm.put(2, "Tuesday");
		hm.put(3, "wednesday");
		hm.put(4, "Thursday");
		hm.put(5, "Friday");
		
		for(Map.Entry<Integer, String> hm1: hm.entrySet()){
			System.out.print(hm1.getKey() + " ");
			System.out.println(hm1.getValue());
		}
		
		System.out.println("\n");
		
		HashSet<String> hs = new HashSet<>();
		hs.add("monday");
		hs.add("tuesday");
		hs.add("wednesday");
		hs.add("thursday");
		hs.add("friday");
		hs.add("saturday");
		
		for(String hs1:hs){
			System.out.println(hs1);
		}
		
		
		
	}

}
