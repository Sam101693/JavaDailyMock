package accessmodifier;

public class PrivateAccessModifier
{
	
	//Only for Method Level
	
	private void add1()
	{
		int no1=90, no2=90;
		int add = no1+no2;
		System.out.println("Addition = "+add);		
	}
	
	public static void main(String[] args) 
	{
		PrivateAccessModifier obj = new PrivateAccessModifier();
		obj.add1();
	}
	
	
	

}
