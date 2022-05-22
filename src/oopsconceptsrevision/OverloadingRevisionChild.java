package oopsconceptsrevision;

public class OverloadingRevisionChild extends OverloadingRevision
{
	
	public void overLoadingMethod(int i,String str)
	{
		System.out.println("overLoadingMethod with two argumnets(int,str) executed from Child Class!!!");
	}
	
	public static void main(String[] args) 
	{
		OverloadingRevisionChild obj = new OverloadingRevisionChild();
		obj.overLoadingMethod(0, null);
		obj.overLoadingMethod();
		
	}//main


}//class
