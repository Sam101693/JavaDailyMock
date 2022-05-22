package oopsconceptsrevision;

import java.util.Scanner;

public class DataEncapParent 
{
	
	Scanner scanner = new Scanner(System.in);
	
	private double current_balance = 30000;
	
	public void getBalance()
	{
		
		System.out.println("!!!Balance Enquiry!!!");
		System.out.println("Your current Balance is "+current_balance);
				
	}//getBalance method
	
	public void withdraw()
	{
		System.out.println("!!!Cash Withraw Method!!!");
		System.out.println("Enter the withdraw Amount");
		double with_amount = scanner.nextDouble(); 
		current_balance = current_balance - with_amount;
		System.out.println("!!!Balance Withdrawl!!!");
		System.out.println("Your current Balance is "+current_balance);
	}//withdraw
	
	
	public void deposit()
	{
		System.out.println("!!!Cash deposit Method!!!");
		System.out.println("Enter the deposit Amount");
		double dep_amount = scanner.nextDouble(); 
		current_balance = current_balance + dep_amount;
		System.out.println("!!!Balance Deposited!!!");
		System.out.println("Your current Balance is "+current_balance);
	}//deposit

		
	public static void main(String[] args) 
	{
		
		
		
		
		
			
		
	}//main method

}//class
