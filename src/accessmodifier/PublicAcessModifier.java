package accessmodifier;

//Class Level

public class PublicAcessModifier extends PrivateAccessModifier
{

	
//Method Level	
 public void add()
{
	
	int no1= 20, no2= 30;
	int add =no1+no2;
	System.out.println("Addition = "+add);
	
}

public static void main(String[] args) 
{

	PublicAcessModifier obj = new PublicAcessModifier();
	obj.add();
	

		
}


}
