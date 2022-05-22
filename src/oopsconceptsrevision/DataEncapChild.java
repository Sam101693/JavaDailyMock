package oopsconceptsrevision;

import java.util.Scanner;

public class DataEncapChild extends DataEncapParent
{
	
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("!!!Welcome to HDFC ATM!!!");
		System.out.println("1.Balance Enquiry");
		System.out.println("2.Cash Withdraw");
		System.out.println("3.Cash Deposit");
		
		System.out.println("Enter your choice = ");
		int choice = scanner.nextInt();
		
		DataEncapChild obj = new DataEncapChild();
		
		switch(choice)
		{
			
			case 1 :
				obj.getBalance();
				break;
				
			case 2:
				obj.withdraw();
				break;
				
			case 3:
				obj.deposit();
				break;
			
			default:
				System.out.println("Invalid Choice");
				break;
				
		
		}//switch
		
		
		
	}//main method

}//class
