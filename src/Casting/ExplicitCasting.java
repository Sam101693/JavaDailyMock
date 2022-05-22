package Casting;

public class ExplicitCasting 
{
	
	public static void main(String[] args) 
	{
		
		//Int to Byte
		int a = 129;
		byte b = (byte)a;

		System.out.println("Explicit Casting Int to Byte");
		System.out.println(b); 	//Byte -128 to 127
		
		//Int to Short
		int c  = 65537;
		short d = (short)c;
		
		System.out.println("Explicit Casting Int to Short");
		System.out.println(d); //Short -32768 to 32767
				
	}//main method
	
}
