package polymorphism;

import accessmodifier.ProtectedAccessModifier;

public class AcessModifier extends ProtectedAccessModifier
{	
	public void hello()
	{		
		System.out.println("Hello from Access modifer");		
	}
		

public static void main(String[] args) 
{		
		AcessModifier obj = new AcessModifier();
		obj.hello();		
		obj.property();			
}
	
}
