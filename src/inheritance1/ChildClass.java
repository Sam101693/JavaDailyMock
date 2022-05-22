package inheritance1;

public class ChildClass extends ParentClass {
	
	
	public ChildClass() 
	{		
		System.out.println("Child Class Constructor Executed");		
	}
	

	public ChildClass(int a)
	{
		System.out.println("CON");
	}
	
	public static void main(String[] args)
	{				
		ChildClass obj = new ChildClass();				
	}
	
}
