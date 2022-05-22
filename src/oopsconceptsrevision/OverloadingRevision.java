package oopsconceptsrevision;

public class OverloadingRevision 
{
	
	//method1
	public void overLoadingMethod()
	{
		System.out.println("overloadingMethod with no arguments executed!!!");
	}
	
	//method2
	public void overLoadingMethod(String str)
	{
		System.out.println("OverloadingMethod with one argument executed!!!");
	}
	
	//method3
	public void overLoadingMethod(String str, int i)
	{
		System.out.println("overLoadingMethod with two argumnets executed!!!");
	}
	
		
	public static void main(String[] args) 
	{
		
		OverloadingRevision obj = new OverloadingRevision();
		obj.overLoadingMethod("Nikhil",10);		
		//obj.overLoadingMethod(10,"Rohit");
	}//main
	
	

}//class
