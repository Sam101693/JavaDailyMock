package practice;

public class StaticVariable {
	
	//Global Variables
	
	
	//Static Variable
	
	static int no1 = 100, no2=100;   //Global Variable
	
	//static global variable in static method
	
	public static void staticAdd()
	
	{
		
		int add = no1 + no2;
		System.out.println("******************Addition of 2 nos using Static Varbiles In Static Method******************************");
		System.out.println(add);
	}
	
	//static global variable in Non static method
	
	public void nonStaticAdd()
	
	{
		int add = no1+no2;
		System.out.println("******************Addition of 2 nos using Static Varbiles In Non Static Method******************************");
		System.out.println(add);
		
	}



public static void main(String[] args) 
{
	
staticAdd();

StaticVariable objectvar = new StaticVariable();
objectvar.nonStaticAdd();

}


}
