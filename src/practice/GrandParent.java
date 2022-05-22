package practice;



public class GrandParent 
{
	
	public void surname()
	{
		System.out.println("Surname executed from GrandParent Class");
		
	}
	
	public static void name()
	{
		System.out.println("Name executed from GrandParent Class");
		
	}
	
	
	public static void main(String[] args) 
	{
		
	GrandParent obj = new GrandParent();
	obj.surname();
	
	name();
		
	}

}
