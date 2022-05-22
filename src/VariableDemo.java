public class VariableDemo 
{
	
	 int  no=20; //global variable
	
	
	public static void m1()
	{
		
		VariableDemo obj = new VariableDemo();
		
		obj.no=10;

		System.out.println(obj.no);
				
	}//m1
	
	
	
	public static void main(String[] args) 
	{
		
		
		VariableDemo obj = new VariableDemo();
		//System.out.println(no);
		m1();
		
	}//main method

}//class
