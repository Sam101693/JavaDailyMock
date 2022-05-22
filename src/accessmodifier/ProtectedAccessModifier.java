package accessmodifier;

public class ProtectedAccessModifier 
{

	protected void property()
	{		
		System.out.println("Property from Parent Class executed!!!");		
	}
	
	public static void main(String[] args) 
	{
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.property();
		
	}
	
	
}
