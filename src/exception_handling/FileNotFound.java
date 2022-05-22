package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound 
{
	//shift+right click for copying file path
	
	
	public static void main(String[] args)
	{		
		
		

		try
		{	
			System.out.println("Before Fetching File");
			FileInputStream fis = new FileInputStream("C:\\Users\\DEMON\\Desktop\\Passbook.jpg");
			System.out.println("After fetching file");
		}
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File not Found Exception Caught!!!");
		}


				
		
	}//main method
	
}//class
