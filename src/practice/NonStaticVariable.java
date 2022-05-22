package practice;

public class NonStaticVariable {
	
	//Global non static variable
	
	int no1=20, no2 = 90;
	
	
	//Global non static variable in static method
	
	
	public static void staticSub()
	
	{
		
		NonStaticVariable objectvar = new NonStaticVariable();
		
		int sub = objectvar.no1 - objectvar.no2;
		
		System.out.println("***************************Substraction of 2 nos using Non static Global Variable in static method*****************");
		
		System.out.println(sub);
	}

	
	
	//Global non static variable in non-static method
	
	public void nonStaticSub()
	{
		int sub = no1 - no2;
		
		
		System.out.println("***************************Substraction of 2 nos using Non static Global Variable in non static method*****************");
		
		System.out.println(sub);
		
		
	}
	

	
	public static void main(String[] args) {
	
		
		staticSub();
		
		NonStaticVariable objectvar = new NonStaticVariable();
		objectvar.nonStaticSub();
		
		
		
		
	}
		

}
