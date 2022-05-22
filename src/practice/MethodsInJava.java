package practice;

public class MethodsInJava {
	
	
	/*
	
	//method
	
	
	//Non Static method
	
	public void nonStatic()
	
	{
		
		System.out.println("Non Static Method Executed!!!");
		
		
		
	}
	
	public static void main(String[] args) {
		
		MethodsInJava j = new MethodsInJava();  //object created
		j.nonStatic();
		
		
	}
	
	
	*/
	
	
	
	
//Static Method 
	
	
	public static void staticMethod()  
	
	{
		
		System.out.println("Static Method is executed!!");
	}
	
	
	
	public static void main(String[] args) {
		
		
		//calling static methods
		staticMethod(); //directly
		MethodsInJava.staticMethod(); //by classname  
			
	}
	
	
}
