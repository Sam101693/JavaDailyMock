package practice;

public class ChildClass extends ParentClass
{
	
	public void salary()
	{
		System.out.println("Salary Method from ChildClass");
	}
	
	public static void bike()
	{
		System.out.println("Bike Method from ChildClass");
	}
	
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
				
		obj.salary();
		
		bike();
		
		obj.property();
		ParentClass.Money();		
		name();
		
	}
}
