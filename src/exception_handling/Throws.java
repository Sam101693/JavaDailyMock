package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws 
{
	
	
public static void main(String[] args) throws FileNotFoundException, InterruptedException
{
		
		//file not found not found 
		System.out.println("Before Fetching File");
		FileInputStream fis = new FileInputStream("C:\\Users\\DEMON\\Desktop\\Passbook.jpg");
		System.out.println("After fetching file");
		
		
		//Interrupted Exception
		
		System.out.println("First Line");
		Thread.sleep(2000);
		System.out.println("Second Line executed after 2000 miliseconds");
	
	
}//main method

		
}//class
