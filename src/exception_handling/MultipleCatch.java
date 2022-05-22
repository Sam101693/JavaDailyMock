package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatch 
{
	
	public static void main(String[] args) 
	{				
		try 
		{
			//int i = 10/0;
			FileInputStream fis = new FileInputStream("C:\\Users\\DEMON\\Desktop\\Passbook.jpg");
			System.out.println("Try is executed");		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Caught");
		}
		catch (NullPointerException e) 
		{
			System.out.println("NullPointer Exception Caught");
		}
		catch(IndexOutOfBoundsException e) 
		{
			System.out.println("IndexOutOfBoundsException Caught");
		}
		catch (Exception e) 
		{
			System.out.println("Exception caught");
		}		
		
	}//main method

}//class
