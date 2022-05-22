package encapsulation;

import java.util.Scanner;

public class Parent {

	private int current_balance = 20000;
	Scanner scanner = new Scanner(System.in);
	
	//Data Encapsulation and Abstraction in GPAY Application
	
	//checkBalance Method
	public void checkBalance(int pin)
	{
		
		//if Pin is correct
		if(pin == 1111)
		{
			
			System.out.println("You current Balance is : "+current_balance);
		}
		
		//if pin is not correct
		else
		{
			
			System.out.println("Incorrect Pin Please Try Again!!");			
		}		
		
	}//checkBalance method
	
	
	//pay method
	public void pay(final int pin)
	{
		
		//Amount that we are going to pay
		System.out.println("Please Enter the amount you want to Pay : ");
		int amount = scanner.nextInt();
		
		if(amount<=current_balance && amount>=0)
		{
		
		current_balance = current_balance - amount;   //Formula for Pay
		System.out.println("Paid Successfully!!!");
		System.out.println("Your current Balance is : "+current_balance);
		System.out.println("You have won a scratch Card!! Thanks for using GPay!!!");
		
		}//if
		
		else if(amount>current_balance)
		{
			
			System.out.println("Insufficient Balance!!!");			
		
		}//else if
		
		else
		{
		
			System.out.println("Invalid Input!!!");
		
		}//else
		
		
		//Current Balance Display after the pay operation is successfully completed
		
		
	}//Pay Method

		
	//Main Method
	public static void main(String[] args) 
	{
		
		Parent obj = new Parent();
		obj.checkBalance(1234); 
		obj.pay(1111); 
					
	}//main
	
		
}//class Parent 

