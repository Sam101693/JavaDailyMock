package accessmodifier;

public class PublicAccessModifier1 extends PublicAcessModifier
{
	public void sub()
	{		
		int no1= 20, no2= 30;
		int sub =no1-no2;
		System.out.println("Addition = "+sub);		
	}

	public static void main(String[] args) 
	{
		
		PublicAccessModifier1 obj = new PublicAccessModifier1();
		obj.sub();
		obj.add();
		
	}

}
