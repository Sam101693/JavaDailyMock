package overriding;

public class Child extends Parent
{	
	static int marry() 
	{		
		System.out.println("Marry method executed from child!!");	
		return 0;
	}
	
	public void Naukri()
	{
		System.out.println("Naukri Method Executed from child!!!!!!");		
	}
	
	public static void main(String[] args) 
	{		
		Child obj = new Child();
		marry();
	
	}
	
	
}
