package collectiondiscussion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapAndLinkedHashMap {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Dhule");
		hm.put(4, "Aurangabad");
		hm.put(3, "Mumbai");
		hm.put(2, "Dhule");
		
		System.out.println("Hash Map : "+hm);
		
		System.out.println("Hash Map Single Key/Value = "+hm.get(4));
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(null, "Goa");
		lhm.put(1, "Dhule");
		lhm.put(4, "Aurangabad");
		lhm.put(7, "Aurangabad");
		lhm.put(3, "Mumbai");
		lhm.put(2, "Pune");
		lhm.put(4, "Nagpur");
		lhm.put(null, "Pakistan");


		System.out.println("Linked Hash Map : "+lhm);
		
		Boolean iskeypresent = lhm.containsKey(14); 
		
		System.out.println("Linked Hash Map Key present or not = "+iskeypresent);
		
		Boolean isvaluepresent = lhm.containsValue("America");
		
		System.out.println("Linked Hash May Value present or not = "+isvaluepresent);
		
	}

}
