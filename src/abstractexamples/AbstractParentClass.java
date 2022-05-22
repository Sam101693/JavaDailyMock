package abstractexamples;

public abstract class AbstractParentClass   //abstract class
{		
	public final void money()
	{
		System.out.println("Money method is executed from Parent Class");	
	}//money
	

	//abstract method
	public abstract void property();  //abstract method
	
	//Constructor
	public AbstractParentClass()
	{
	
		System.out.println("Constructor from Parent Class executed!!");
		
	}
	
		
	public static void main(String[] args) 
	{
		
	//	AbstractParentClass obj = new AbstractParentClass();  we cannot create the object of Abstract Class anywhere.
		
		
	}

}//class
