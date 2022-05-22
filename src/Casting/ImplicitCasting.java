package Casting;

public class ImplicitCasting 
{
	public static void main(String[] args) 
	{
		
		byte b = 20;
		
		int c = (int)b; 		
		System.out.println("implicit casting Byte to int");
		System.out.println(c);
		
		float d = (float)b;	
		System.out.println("implicit casting Byte to float");
		System.out.println(d);
		
		
		float e = (float)c;
		System.out.println("implicit casting int to float");
		System.out.println(e);
		
		
		double f = (double)e;
		System.out.println("implicit casting float to double");
		System.out.println(f);
		

		
	
	
	}//main method




}//class
