package interfacediscussion;

public class HondaShine extends BajajDiscover implements Bike,CompanyStandards
{		
	//Bike Interface Methods
	
	//mileage method from Bike Interface
	public void mileage()
	{
		System.out.println("Mileage of Honda Shine bike must be above 60kms/liter");				
	}//mileage method

	//speed method from Bike Interface
	public void speed() 
	{
		System.out.println("Maximum Speed of Honda Shine should be 180 km/hr");		
	}//speed method

	//suspension method from Bike Interface 
	public void suspension() 
	{		
		System.out.println("The front suspension of Honda Shine bike must be telescopic and the rear suspension should be coil spring supension");
	}//suspension method

	//brakes method from Bike Interface
	public void brakes() 
	{		
		System.out.println("Brakes used in Honda Shine bike must be Disk Brake");		
	}//brake method

	//clutch method from Bike Interface
	public void clutch() 
	{
		
		System.out.println("Good quality clutch must be used in Honda Shine");
		
	}//clutch method
	
	
	
	//CompanyStandards Interface Methods
	
	
	//comapanyLogo
	public void companyLogo()
	{
		
		System.out.println("Company Logo must be visible");
		
	}//companyLogo method

	//seating
	public void seating() 
	{
	
		System.out.println("Seating should be comfortable");
	
	}//seating method

	//stand method
	public void stand() {
		
		System.out.println("Stand must be capable to handle the load of bike");
		
	}//seating method

	//Frame
	public void frame() 
	{
		
		System.out.println("Frame should be design as per Bike's usage");
		
	}//frame method

	
	
	public static void main(String[] args) 
	{
		
		HondaShine obj = new HondaShine();
		
		
		//Bike Interface
		System.out.println("Honda Shine Bike Rules :");
		obj.mileage();  //calling mileage
		obj.speed();   //calling speed method
		obj.suspension(); //calling suspension method
		obj.brakes();   //calling brakes method
		obj.clutch();	//calling clutch method
		
		Bike.speedometer();   //calling speedometer static method
		
		//CompanyStandards Interface
		
		obj.companyLogo();
		obj.seating();
		obj.stand();
		obj.frame();
		System.out.println();
		
		

		//BajajDiscover 
		obj.bajajBikeRules();
		obj.mileage();  //calling mileage
		obj.speed();   //calling speed method
		obj.suspension(); //calling suspension method
		obj.brakes();   //calling brakes method
		obj.clutch();	//calling clutch method
		
		Bike.speedometer();   //calling speedometer static method
		
		//CompanyStandards Interface
		
		obj.companyLogo();
		obj.seating();
		obj.stand();
		obj.frame();


	}


}//class
