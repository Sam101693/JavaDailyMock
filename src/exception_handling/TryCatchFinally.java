package exception_handling;

public class TryCatchFinally 
{
		
	public static void main(String[] args) 
	{
		
		try
		{	
			System.out.println("Try Block Executed!!!");
			int i=10/0;
		}//try

		catch(Exception e)
		{	
			
			System.out.println("Exception Occurred!!!");
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println("Catch executed!");			
			
		}//catch

		finally 
		{
			
			System.out.println("Finally block executed");		

		}//finally
				
	}//main method
	
}//class
