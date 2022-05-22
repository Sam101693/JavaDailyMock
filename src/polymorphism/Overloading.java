package polymorphism;

public class Overloading 
{	
	//Overloading
	public void add()
	{
		
		int no1= 10, no2= 20;
		int add = no1 + no2;
		System.out.println("Addition(No Parameter) = "+add);
		
	}
	
	public void add(int no1, int no2)
	{
		int add = no1+no2;
		System.out.println("Addition(With 2 Parameters) = "+add);				
	}
	
	public static void main(String[] args) 
	{		
		Overloading obj = new Overloading();
		obj.add(10,20);		
	}		
}
