package practice;

public class CallingNonStaticMethodFromAnotherMethods {
	
	
	/*
	
	
	//Calling Non Static Method from Another Non Static Method 
	
	//1st Non Static Method 
	
public void parentNonStaticMethod ()

{
	
	System.out.println("Calling ParentNonStaticMethod from Another Non Static");
}

// 2nd Non Static Method 

public void childNonStaticMethod()

{
	parentNonStaticMethod(); //from same class we can call another non static method directly
	
	CallingNonStaticMethodFromAnotherMethods var = new CallingNonStaticMethodFromAnotherMethods();
	var.parentNonStaticMethod(); //from different class we can call another non static method by objectreferencename
	
}


public static void main(String[] args) {
	
	CallingNonStaticMethodFromAnotherMethods var = new CallingNonStaticMethodFromAnotherMethods();
	var.childNonStaticMethod();
	
}


*/


	//Calling Non Static Method from Another Non Static Method 

	
	
	//Non Static Method 
	
public void parentNonStaticMethod()

{
	
	System.out.println("Calling Non Static method from Another Static Method!!");
	
}

//static method

public static void childStaticMethod()

{
	
	
	CallingNonStaticMethodFromAnotherMethods var = new CallingNonStaticMethodFromAnotherMethods(); //object created
	var.parentNonStaticMethod();  //calling nonstatic method
	
	System.out.println("Hello!");
	
	
	
}





	
public static void main(String[] args) {
	
	
	childStaticMethod();
}	
		
	
	
}
