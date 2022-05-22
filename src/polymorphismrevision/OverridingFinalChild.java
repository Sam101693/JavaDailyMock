package polymorphismrevision;

public class OverridingFinalChild extends OverridingFinal {
	
	public void call()
	{	
		System.out.println(str);
	}

	
	public static void main(String[] args) 
	{		
		OverridingFinalChild obj = new OverridingFinalChild();
		obj.call();		
	}
	

}

