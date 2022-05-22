
public class Sum_of_area_of_three_lands {
	
	
	//Method for Area of Land using Static Method 
	
	
	public static double area_Of_Land_Static_Method(double length, double width) 
	
	{
		
		return length * width;
		
	}
	
	
	//Method for Area of Land using Non-Static Method
	
	public double area_Of_Land_Non_Static_Method(double length, double width)
	
	{
		
		return length * width;
		
	}
	
	public static void main(String[] args) {
		
		 //Sum of Area of all 3 Lands Using Non Static Method
		
		  System.out.println("************************Sum of Area of all 3 Lands Using Non Static Method*********************************************");
		
		  Sum_of_area_of_three_lands object_var = new Sum_of_area_of_three_lands();
		
		
		  //Area of Land 1
		  double land1 =  object_var.area_Of_Land_Non_Static_Method(200, 200);
		  System.out.println("Area of Land1 = "+land1);
		  
		  //Area of Land2
		  double land2 = object_var.area_Of_Land_Non_Static_Method(300, 300);
		  System.out.println("Area of Land2 = "+land2);
		  
		  //Area of Land3
		  double land3 = object_var.area_Of_Land_Non_Static_Method(400, 400);
		  System.out.println("Area of Land3 = "+land3);
		  

		  //Sum of area of 3 Lands
		  double sum = land1 + land2 + land3;
		  System.out.println("Sum of area of all 3 Lands = "+sum);
		  
		  //Sum of Area of all 3 Lands Using Static Method
		  
		  
		  System.out.println("************************Sum of Area of all 3 Lands Using Static Method********************************");
		  
		  
		  //Area of Land1
		  double l1 = area_Of_Land_Static_Method(1200, 1200);
		  System.out.println("Area of Land1 = "+l1);
		  
		  //Area of Land2
		  double l2 = area_Of_Land_Static_Method(800, 800);
		  System.out.println("Area of Land2 = "+l2);
		  
		  
		  //Area of Land3
		  double l3 = area_Of_Land_Static_Method(1400, 1400);
		  System.out.println("Area of Land3 = "+l3);
		  
		  double total_area_of_land = l1 + l2+ l3;
		  System.out.println("Sum of area of all 3 Lands = "+total_area_of_land);
		  
		 
		  
		  
	}
}
