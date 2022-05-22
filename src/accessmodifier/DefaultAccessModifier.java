package accessmodifier;

//Default Class Level

class DefaultAccessModifier
{
	
	//Default Method Level
	
	void add()
	{
		int no1=90, no2=30;
		int add = no1+no2;
		System.out.println("Addition = "+add);
				
	}
	public static void main(String[] args) 
	{
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.add();
		
	}

}
