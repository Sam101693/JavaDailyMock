package oopsconceptsrevision;

public class OverridingRevisionChild extends OverridingRevision 
{	
	public int overridingMethod()
	{
		System.out.println("overridingMethod with no arguments executed from OverridingRevisionChild");
		return 1;
	}
	
	public static void overridingStaticMethod()
	{
		System.out.println("overridingStaticMethod with no arguments executed from OverridingRevisionChild class");
	}
	
	public OverridingRevisionChild(int no1)
	{
		System.out.println("OverridingRevisionChild Constructor executed");
	}

		
	public static void main(String[] args) 
	{		
		OverridingRevisionChild obj = new OverridingRevisionChild(10);
		obj.overridingMethod();		
	}


	/*
	
	public static void main(String[] args) 
{
	OverridingRevisionChild obj = new OverridingRevisionChild();
	obj.overridingMethod(); //child class
	
	OverridingRevision obj1 = new OverridingRevision();
	obj1.overridingMethod(); //parent class
	
	OverridingRevision obj2 = new OverridingRevisionChild();
	obj2.overridingMethod(); //child class
	
	overridingStaticMethod();  //child class
	
	OverridingRevision.overridingStaticMethod();  //parent class
		
	obj.overridingStaticMethod(); //child class
	
	obj2.overridingStaticMethod(); //parent class
	
	OverridingRevisionChild.overridingStaticMethod(); //child class
	
		
}//main

*/

}//class
