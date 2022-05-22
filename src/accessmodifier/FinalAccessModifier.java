package accessmodifier;

//Final for Only Class Level
final class FinalAccessModifier 
{
	
	public void add()
	{
		int no1=90, no2= 50;
		int add = no1+no2;
		
		System.out.println("Addition = "+add);
		
	}
	
	public static void main(String[] args) 
	{
		FinalAccessModifier obj = new FinalAccessModifier();
		obj.add();
		
	}
	

}
