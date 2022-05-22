package polymorphismrevision;

public class OverridingChildClass extends OverridingParentClass {
	
	String str = "Nike from Child";
	
	//2nd Overriding Method
	public void math()
	{
		System.out.println("Math Method from child executed");		
	}
	
	//4th Overriding Method
	protected int marry() 
	{
		System.out.println("Marry Method from Child Executed");
		return 0;
	}
	
	public static void main(String[] args) 
	{		
		OverridingChildClass obj = new OverridingChildClass();
		obj.math();	   //calling non static overriding math method(Child Class)	
		obj.marry();   //calling non static overriding marry method(Child Class)
		obj.add();     //calling non static non overriding add method(Parent Class)
		
		//alternative way to create object
		OverridingParentClass obj2 = new OverridingChildClass();		
		obj2.math();	   //calling non static overriding math method(Child Class)	
		obj2.marry();   //calling non static overriding marry method(Child Class)
		obj2.add();     //calling non static non overriding add method(Parent Class)
		
		System.out.println(obj.str);  //calling non static global variable from Child Class							
	}

}
