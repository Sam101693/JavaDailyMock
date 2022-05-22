package exception_handling;

public class NullPointer 
{
	static NullPointer obj;
	
	public void m1()
	{
		System.out.println("m1 method executed!!");
	}//m1
	
	
	
	public static void main(String[] args) 
	{
		try
		{
		obj.m1();
		}		
		catch(NullPointerException e)
		{
			System.out.println("Catch Executed!!");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("2nd Catch Executed");
		}
			
	}//main method
	

}//class
