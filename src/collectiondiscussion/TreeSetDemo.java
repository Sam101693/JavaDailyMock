package collectiondiscussion;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{

		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("1Dhule");
		tset.add("2Pune");
		tset.add("3Aurangabad");
		tset.add("1Dhule");
		tset.add("2Pune");
		tset.add("3Aurangabad");
		tset.add("1Dhule");
		
		System.out.println(tset);

	}//main

}//class
