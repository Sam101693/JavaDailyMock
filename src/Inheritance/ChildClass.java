package Inheritance;import practice.ThisKeyword;

public class ChildClass extends ParentClass {

	
	String s = "s variable from Child Class";
	
	static String a = "a variable from Child Class";

	
	public void childMethod()
	{
		
	System.out.println(s);
	
	System.out.println(a);
	
	//System.out.println(super.s);
	
	//System.out.println(super.a);
	
	}
	
	
	public ChildClass()
	
	{
		
		System.out.println("Child Class Constructor Executed");
	}
	
	public static void main(String[] args) 
	{
	ChildClass obj = new ChildClass();
	
	obj.childMethod();
	
	ParentClass obj1 = new ParentClass();
	System.out.println(obj1.s);
	
	System.out.println(obj.b);
		
	}
	
	
}
