package polymorphismrevision;

public class OverridingParentClass 
{	
	String str = "Nike From Parent";
			
	//1st Overriding Method
	public void math()
	{
		System.out.println("Math from Parent Class Executed");
		System.out.println(str);
	}
		
	//3rd Overriding Method
	int marry() 
	{
		System.out.println("Marry Method from Parent Executed");
		return 100;
	}
	
	
	//Non Overriding Method
	public void add() 
	{		
		System.out.println("Add method Executed from Parent");		
	}
	
	
	

}
