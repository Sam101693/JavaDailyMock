package practice;

public class ParentClass extends GrandParent

	{
	
	//Property Method
	public void property()
	{
		System.out.println("Property Method executed from ParentClass");
		
	}
	
	
	public static void Money()
	{
		
		System.out.println("Money Method executed from ParentClass");
		
	}
	

	public static void main(String[] args) 
	{
	
		
		ParentClass obj = new ParentClass();
		obj.property();
		
		Money();
		
		obj.surname();
		
		
		
	}
	
	

}
