package exception_handling;

public class DivideByZero {
	
	public static void main(String[] args) 
	{		
		int no1=22;
		int no2=0;
		int result;
		
		try
		{
			result = no1/no2;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
		System.out.println("No Exception(Catch Executed)");
		no2 = 10;
		}
		
		
		

}

}