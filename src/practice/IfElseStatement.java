package practice;

public class IfElseStatement {
	
	
	public static void main(String[] args) {
		
		// If using >=
		
		int no1 = 90, no2 = 80;
		
		if (no1 >= no2)
			
		{
			
			System.out.println("No1 is greater than no2");
			
		}
		
		else 
			
		{
			System.out.println("No2 is greater than No1");
		}
		

		
		//If using < 
		
		no1 = 11;
		no2 = 23;
		
		if (no1 < no2)
		{
			System.out.println("No1 is less than No2");
		}
		
		else 
		{
			System.out.println("No2 is less than No1");
		}
		
		//If Using !=
		
		no1 = 20;
		no2 = 20;
		
		
		if (no1 != no2)
		{
			System.out.println("No1 is not equal to No2");			
		}
		
		
		else 
		{
			System.out.println("No2 is not equal to No1");
		}
		
		
		//If using &&
		
		int no3 = 20, no4 = 90;
		no1 = 11;
		no2 = 22;
		
		
		
		
		
		if (no1 > no2 && no3 > no4)
		{
			System.out.println("True");
		}
		
		else
		{

			System.out.println("False");
		}
		
	}
	

}
