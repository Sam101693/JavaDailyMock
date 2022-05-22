package interfacediscussion;


public interface Bike 
{

	//unimplemented non static methods
	public void mileage();
	public void speed();
	public void suspension();
	public void brakes();
	public void clutch();
	
	
	//implemened static method
	public static void speedometer()
	{
		
		System.out.println("It should show accurate speed");
		
	}
	
}
