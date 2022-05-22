package Casting;

public class NonPrimitiveCastingChild extends NonPrimitiveCastingParent
{
	
	public void m1()
	{
		System.out.println("m1 method from Child Class executed");
	}//m1

	
	public void m2()
	{
		System.out.println("m2 method from Child Class executed");
	}//m2

	
	public static void main(String[] args) 
	{
		
		NonPrimitiveCastingChild child_obj = new NonPrimitiveCastingChild(); //Child Class object created
		
		//up casting		
		NonPrimitiveCastingParent parent_obj = (NonPrimitiveCastingParent)child_obj;
		
		
		child_obj.m1();
		child_obj.m2();
		
		parent_obj.m1();
		parent_obj.m2();
		
		//down casting
		
		NonPrimitiveCastingChild child_obj1 = new NonPrimitiveCastingChild();  //child class object created
		
		//NameOfParentClass NameOfParentClassRefVariableName = (NameOfParentClass)ChildClassRefVariableName
		NonPrimitiveCastingParent parent_obj1 = (NonPrimitiveCastingParent)child_obj1; //Up casting
		
		//NameOfChildClass NameOfChildClassRefVariableName = (NameOfChildClass)NameOfParentClassRefVariableName
		NonPrimitiveCastingChild child_obj2 = (NonPrimitiveCastingChild)parent_obj1; //down casting
		
		parent_obj1.m1();
							
	}//main method

}
