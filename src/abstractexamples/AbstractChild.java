package abstractexamples;

public class AbstractChild extends AbstractParentClass
{
	//abstract method from Abstract Parent class
	public void property() 
	{
		System.out.println("Property abstract method is excuted from Child Class");		
	}
	
	//Constructor
	public AbstractChild()
	{
	
		System.out.println("Constructor from Child Class executed!!");
		
	}//constructor	
		
	
	public static void main(String[] args) 
	{
		
		AbstractChild obj = new AbstractChild();
		obj.property();
						
	}//main
	
	
}//class
