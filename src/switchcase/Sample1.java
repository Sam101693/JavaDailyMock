package switchcase;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Sample1 {
		
	int choice = 0;
		
	Scanner scanner = new Scanner(System.in);

	
	public void switchMethod()
	{	
		
		
		System.out.println("Area Calculator");
		
		System.out.println("1.Area of Circle\n2.Area of Triangle\n3.Area of Square\n4.Area of Rectangle");
		
		System.out.println("Enter Your choice : ");
		choice = scanner.nextInt();
		
		switch(choice) 
		{
		
		//Area of Circle
		
		case 1:
			System.out.println("Area of Circle");
			
			System.out.println("Enter Radius = ");
			double radius = scanner.nextDouble();
			
			double area = 3.14 *(radius*radius);
			
			System.out.println("Area of circle = "+area);
			
			
		//Area of Triangle	
			
		case 2:
			System.out.println("Area of Triangle");
			
			System.out.println("Enter Length");
			double length = scanner.nextDouble();
			
			System.out.println("Enter Height");
			double height = scanner.nextDouble();
			
			double areaoftriangle = 0.5*length*height;
			
			System.out.println("Area of Triangle = "+areaoftriangle);
			
		
		//Area of Square
			
		case 3:
			System.out.println("Area of Square");
			
			System.out.println("Enter side value= ");
			double side = scanner.nextDouble();
			
			double area_of_square = side*side;
			System.out.println("Area of Square = "+area_of_square);											
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{		
		Sample1 obj = new Sample1();
		obj.switchMethod();		
		
	}
	
	
	
	
	

}
