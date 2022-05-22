package collectiondiscussion;

import java.util.Arrays;

public class SortingArray 
{
	
	public static void main(String[] args) 
	{
		
		int int_array [] = new int[5]; 
		
		int_array[0] = 10;
		int_array[1] = 40;
		int_array[2] = 90;
		int_array[3] = 7;
		int_array[4] = 18;
		
		
		
		//Array gets Sort In Ascending Order
		Arrays.sort(int_array);
		
		System.out.println("Array After Sorting In Ascending Order");
		System.out.print("[ ");
		
		for(int i:int_array)
		{
			
			System.out.print(i+" ");
			
			
		}//for
		
		System.out.println("]");
		System.out.println("Array After Sorting In Descending Order");
		
		
		System.out.print("[ ");
		for(int i=int_array.length-1;i>=0;i--)
		{
			
			System.out.print(int_array[i]+" ");
			
		}
		System.out.println(" ]");
	}

}
