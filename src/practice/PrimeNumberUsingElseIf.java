package practice;

import java.util.Scanner;

public class PrimeNumberUsingElseIf {
	
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no = ");
		int no = scanner.nextInt();
		
		
		//For Prime
		if(no == 2 || no == 3 || no == 5 || no==7 || no==11 || no==13 || no==17)
		{
			System.out.println("No is prime(if)");
		}

		//Not prime
		
		else if(no%4==0 || no%6==0 || no%8==0 || no%9==0 || no%10==0 || no%12==0 || no%14==0)
		{
			System.out.println("No is not prime");
		}
		
		
		//Prime
		else
		{
			System.out.println("No is prime(else)");
			
		}
		
		
		
	}
	

}
