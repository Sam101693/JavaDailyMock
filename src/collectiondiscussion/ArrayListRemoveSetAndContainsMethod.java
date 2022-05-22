package collectiondiscussion;

import java.util.ArrayList;

public class ArrayListRemoveSetAndContainsMethod 
{
	
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(100);
		
		System.out.println("Array List Before Remove Operation");
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println("Array List After Remove Operation");
		System.out.println(al);
		
		Boolean ispresent = al.contains(al.get(0));
		
		System.out.println(ispresent);
		
	
		al.set(2, 101);
		
		System.out.println("Array List After Set Operation");
		System.out.println(al);
		
		
	}//main

}//class
