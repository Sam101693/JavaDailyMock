package collectiondiscussion;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args) 
	{
	
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("abc");
		al1.add("def");
		al1.add("ghi");
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("stu");
		al2.add("vwx");
		al2.add("yz");
		
		al2.addAll(al1);
		
		System.out.println(al2);
		
		Boolean ispresent = al2.containsAll(al1);
		
		System.out.println(ispresent);
		


	}//main

}//class
