package collectiondiscussion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListConversion 
{

	public static void main(String[] args)
	{
		
		String str_array[] = {"Nikhi","Shubhu","Me"};
		
		//Converstion of String Array to String Array List
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str_array));
		
		System.out.println(al);
		
		
	}//main
	
	
}//class
