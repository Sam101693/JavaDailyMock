package practice;

public class IncrementAndDecrement {
		
public static void main(String[] args) {
	
		
		//Increment Operator 
		
		//1. Post Increment Operator
		
		int no1 = 90;
		
		int no2 = no1++;    //Post Increment 
		
		
		System.out.println("POST Increment OPERATOR");
		System.out.println("No1 = "+no1);
		System.out.println("No2 = "+no2);

		
		//2. Pre Increment Operator 
		
		int preno1 = 20;
		int preno2 = ++preno1;
		
		System.out.println("Pre Increment Operator");
		System.out.println("No1 = "+preno1);
		System.out.println("No2 = "+preno2);
		
		
		//Decrement Operator
		
		//1. Post Decrement Operator 
		
		int postdecno1 = 30;
		int postdecno2 = postdecno1--;   // 30 is copied 1st in no2 and then decrement by 1 i.e 30-1 = 29, no1 = 29.
		
		
		System.out.println("Post Decrement Operator");
		System.out.println("No1 = "+postdecno1);
		System.out.println("No2 = "+postdecno2);
		
		
		//2. Pre Decrement Operator
		
		int predecno1 = 30;
		int predecno2 = --predecno1;
		
		System.out.println("Pre Decrement Operator");
		System.out.println("No1 = "+predecno1);
		System.out.println("No2 = "+predecno2);
		
				
	}
	
	
}
