package collectiondiscussion;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetAndLinkedHashSet
{
	
	public static void main(String[] args) 
	{
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add(null);
		hs.add("Shubhu");
		hs.add("Shubhu");
		hs.add("Nikhil");
		hs.add("Nikhil");
		hs.add("Me");
		hs.add(null);
		
		System.out.println("Hash Set : "+hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add(null);
		lhs.add("Shubhu");
		lhs.add("Shubhu");
		lhs.add("Nikhil");
		lhs.add("Nikhil");
		lhs.add("Me");
		lhs.add(null);

		System.out.println("LinkedHash Set = "+lhs);
		
	}//main 

}//class
