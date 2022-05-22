package polymorphismrevision;

public class OverridingFinal {
	
	final String str = "Nike";
	
	public void sample()
	{
		System.out.println(str+"abc");		
	}
	
	
	public static void main(String[] args) 
	{
		
		OverridingFinal obj = new OverridingFinal();
		obj.sample();		
	}
	
	
	

}
