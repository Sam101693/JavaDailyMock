package exception_handling;

public class NullPointerExeceptionUsingString 
{
	static String str1 = null;
	static String str2 = null;
	

	public static void main(String[] args) 
	{		
		try
		{
		System.out.println("Try Block");	
		str1.equals(str2);
		System.out.println("Try executed");
		}//try
		catch (NullPointerException e)
		{
			System.out.println("Exception occured!!!");
		}//catch
		
	}//main method

}//class
