package collectiondiscussion;

import java.util.ArrayList;

public class ArrayListToArrayConvertion 
{
	
	public static void main(String[] args)
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
				
		int size = al.size();
		
		Integer int_array[] = new Integer[size];
		
		al.toArray(int_array);
		
		for(int i=0;i<size;i++)
		{
			
			System.out.println(int_array[i]);
			
		}//for
		
	}//main
	
}//class
