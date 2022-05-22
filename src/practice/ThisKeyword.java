package practice;

public class ThisKeyword {
		
	int no1 = 10, no2 = 30;   //Global
	
	//static method
	
	public static void staticMul()
	
	{
		int no1 = 50, no2 = 10, mul;  //Local
		mul = no1 * no2;
		System.out.println("Multiplication In Static= "+mul);	
		
		ThisKeyword objectvar = new ThisKeyword();
		mul = objectvar.no1 * objectvar.no2;
		System.out.println("Multiplication In Static(This)= "+mul);	
		
	}

	public void nonStaticMul()
	
	{
		
		int no1 = 10, no2 = 10, mul;  //Local
		mul = no1 * no2;
		System.out.println("Multiplication In Non Static = "+mul);	
		
		
		mul = this.no1 * this.no2;
		System.out.println("Multiplication In Non Static(This)= "+mul);	
				
	}
		
	public static void main(String[] args) {
		
		staticMul();
		
		ThisKeyword objectvar = new ThisKeyword();
		objectvar.nonStaticMul();
		
		
		
	}
	

}
