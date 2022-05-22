package stringclass;

public class StringBasics 
{
	
	public static void main(String[] args) 
	{
		//1st way
		String str ="Hello";
		
		String str3 = "Hello";
		
		//2nd way
		String str1 = new String("Hello");
		
		String str2 = new String("Hello");
		
		boolean isEqual = str==str3;
		
		System.out.println(isEqual);
		
	}//main
		

}//class
