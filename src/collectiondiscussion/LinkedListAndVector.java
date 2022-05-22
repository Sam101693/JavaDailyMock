package collectiondiscussion;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListAndVector
{
	
	public static void main(String[] args) 
	{
		
		
		LinkedList<String> LL = new LinkedList<String>();
		
		LL.add("aa");
		LL.add("sss");
		System.out.println(LL);
		LL.set(0, "qqq");
		System.out.println(LL);
		System.out.println("Get Operation : "+LL.get(0));
		LL.remove(0);
		System.out.println(LL);
		
		
		Vector<String> vct = new Vector<String>();
		vct.add("aaa");
		System.out.println(vct);
		
		
	
	}//class

}//class
