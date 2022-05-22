package practice;

public class CallingStaticMethodFromAnotherMethods {

	
	/*
	
	//Calling Static Method From Non Static Method
	
	//Static Method
	
	public static void parentStaticMethod()
	
	{
		
		System.out.println("Static Method Called From NonStatic Method");
		
	}
	
	//Non Static Method
	
	public void childNonStaticMethod()
	
	{
		
		parentStaticMethod();
		
	}
	
	public static void main(String[] args) {
		
		parentStaticMethod();
		CallingStaticMethodFromAnotherMethods var= new CallingStaticMethodFromAnotherMethods();
		var.childNonStaticMethod();
		
		
	}


*/

	//Calling Static Method From Another Static Method
	
	//1st static method
	
	public static void parentStaticMethod()
	
	{
		
		System.out.println("ParentStaticMethod Called from Another Static Method");
		
	}
	
	//2nd Static Method
	
	public static void childStaticMethod()
	
	{
		
	parentStaticMethod(); 	
		
	}
	
	
	public static void main(String[] args) 
	
	{
	
		childStaticMethod();
		
		
	}
	


}
