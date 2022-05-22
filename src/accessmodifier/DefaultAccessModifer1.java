package accessmodifier;

class DefaultAccessModifer1 extends DefaultAccessModifier
{

	void sub()
	{
		int no1=90, no2=30;
		int sub = no1-no2;
		System.out.println("Substraction = "+sub);
				
	}
	public static void main(String[] args) 
	{
		DefaultAccessModifer1 obj = new DefaultAccessModifer1();
		obj.sub();
		obj.add();
		
	}

	
	

}
