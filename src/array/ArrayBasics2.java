package array;

public class ArrayBasics2
{
	
	
	public static void main(String[] args) 
	{
		//2nd Way to define array
		int a[] = {10,40,50,60};
				
		
		//normal for loop
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
			
		}//for
				
		
		//advance for loop
		
		for(int j : a)
		{
			
			System.out.println(j);
			
		}
		
		
	}//main method
	

	
    	
	
}//class
