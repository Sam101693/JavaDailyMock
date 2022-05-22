package practice;

public class CategoriesOfMethods {
	
		
	/*
	
	
	
	//Type 1 : No return Type and arguments
	
	//static method 
	
	public static void staticMethod()
	
	{
		System.out.println("Static Method with No return Type and arguments");
	}
	
	//Non Static Method
	
	public void nonStaticMethod()
	
	{
		
		System.out.println("Non-Static Method with No return Type and arguments");
	}

public static void main(String[] args) {
	
	staticMethod();   //static method called directly
	
	//Non Static Method Called Directly
	CategoriesOfMethods objectvar = new CategoriesOfMethods();
	objectvar.nonStaticMethod();
	
}

*/
	
	
/*	
	
	//Type 2 : No Return Type with arguments 
	
	
	//static method for adding 2 nos
	
	public static void staticMethodAdd(int no1, int no2)
	
	{
		int add;
		System.out.println("*********************Addition of two Nos Using Static Method**************************");
		add = no1 + no2;
		System.out.println("Addition of 2 nos = "+add);
		
	}
	
	//non static method for adding 2 nos
	
	
	
	public void nonStaticMethodAdd(int no1, int no2)
	{
		int add;
		System.out.println("*********Addition of two Nos Using Non-Static Method**************************");
		add = no1 + no2;
		System.out.println("Addition of 2 nos = "+add);
		
	}
	
	
	public static void main(String[] args) {
		
		staticMethodAdd(50, 50);
		
		CategoriesOfMethods objectvar = new CategoriesOfMethods();
		objectvar.nonStaticMethodAdd(100, 100);
	
	}
	
	
	
	
	
	
	
	*/
	


// Type Return Type with No Argument 
	
	
	//static method for substraction of 2 nos
	

	/*
	
	public static float staticMethodSub()
	
	{
		float no1 = 20f, no2 = 30f;
		float sub; //local variable
		sub = no1 - no2;  //Substraction
		return sub;
				
	}
	
	
	//non static method for substraction of 2 nos
	
	
	public float nonStaticSub() 
	
	{
		float no1 = 120f, no2 = 130f;
		float sub;
		sub = no1 - no2;		
		return sub;	
		
	}
	
	

	
	public static void main(String[] args) {
		
		
		
		
		CategoriesOfMethods objectvar = new CategoriesOfMethods();
		
		float substatic = staticMethodSub();
		
		float subnonstatic =  objectvar.nonStaticSub();
		
		//static
		
		System.out.println("**************static method for substraction of 2 nos**************************");
		
		System.out.println(substatic);
		
		
		//non static 
		
		System.out.println("**********************non static method for substraction of 2 nos**************************");
		
		System.out.println(subnonstatic);
		
			
	}


*/


//Type 4 : With Return Type and Argument	
	
	
	
	
	//Static Method
	
	public static int staticMethodMulti(int no1, int no2)
	{
		
		int multi = no1 * no2;
		return multi;
		
	}
	
	
	//Non Static Method
	
	
	public int nonStaticMethodMulti(int no1, int no2)
	
	{
		
		int multi = no1 * no2;
		return multi;
		
	}
	
	
	public static void main(String[] args) {
		
		float multistatic = staticMethodMulti(36, 42); //static
		
		CategoriesOfMethods objectvar = new CategoriesOfMethods();
		
		float multinonstatic = objectvar.nonStaticMethodMulti(20, 10); //non static
		
		System.out.println("*****************Multiplication of 2 nos using Static Method******************************");
		System.out.println(multistatic);
		
		System.out.println("*****************Multiplication of 2 nos using Non - Static Method******************************");
		System.out.println(multinonstatic);
		
		
		
	}		
	
}
