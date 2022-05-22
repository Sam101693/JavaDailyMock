package exception_handling;

public class ThrowKeyword {

	static void throwException()
	{
		
		int i=10;
		int j=5;
			
		if(i>j)
		{
			System.out.println("If executed");
			throw new NullPointerException("Null Pointer Exception occurred!!!");			
		}
		
		else
		{
			System.out.println("else executed");
		}
	}
	
	public static void main(String[] args) 
	{
		throwException();
		
	}
	
	
	
}
