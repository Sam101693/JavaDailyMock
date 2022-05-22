package error;

public class StackOverflow {
	
	
	//Stack Overflow
	
	public void m1()
	{
		System.out.println("m1 method executed");
		m2();
	}
	
	public void m2()
	{
		System.out.println("m2 method executed");
		m1();
	}
	
	public static void main(String[] args) 
	{

		StackOverflow obj = new StackOverflow();
		obj.m1();
		
	}

}
