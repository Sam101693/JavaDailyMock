package array;

public class ArrayDisplayReverseChar
{
	
	public static void main(String[] args) 
	{
		
		char a[]= {'N','I','K','H','I','L'};  //Index 5 Size 6
		
		int size = a.length-1;  //Array_Total_Size-1
		
		String s =  ""; //Empty String
		
		for(int i=size;i>=0;i--)
		{
			System.out.println(a[i]);
			s=s+a[i]; //concating empty string with single char array element			
		}//for
		
		System.out.println(s); //LIHKIN
		
		
	}//main

}//class
