package practice;

public class LocalVariable {
	
	//Local Variable in static method 
	
	
	
	public static void staticDiv()
	
	{
		int div,no1 = 50,no2 = 10;
		
		System.out.println("********************************Division of Two Nos using Local Varaible in static method*********************************************");
		div = no1/no2;
		System.out.println(div);
	}

	//Local Variable in static method 
	
	public void nonstaticDiv() 
	{
		
		double div,no1=10,no2=51;
		System.out.println("********************************Division of Two Nos using Local Varaible in non static method*********************************************");
		div = no1/no2;
		System.out.println(div);
	}



	public static void main(String[] args) {
		
		staticDiv();
		
		LocalVariable objectvar = new LocalVariable();
		objectvar.nonstaticDiv();		
	}


	
}
