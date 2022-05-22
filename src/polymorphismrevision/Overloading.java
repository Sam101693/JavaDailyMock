package polymorphismrevision;

public class Overloading 
{
		
//1st Overloading Method	
public void overloadingMethod1()
{
System.out.println("1st Overloading Method Exeuted");	
}

//2nd Overloading Method
public void overloadingMethod1(String s)
{	
	System.out.println("2nd Overloading Method Executed");	
}


//3rd Overloading Method
public void overloadingMethod1(int no1)
{
	System.out.println("3rd Overloading method Executed");	
}


//4th Overloading Method
public static void overloadingMethod1(int no1, String str)
{
	System.out.println("4th Overloading Method Executed");	
}


//5th Overloading Method
public static void overloadingMethod1(String str, int no1)
{	
	System.out.println("5th Overloading Method Executed");	
}

//6th Overloading Method
private double overloadingMethod1(double no1)
{
	System.out.println("6th Overloading Method Executed");
	return 0;
}

public static void main(String[] args) 
{
	
	Overloading obj = new Overloading();
	
	obj.overloadingMethod1("abc");  //calling second overloading method
	
	obj.overloadingMethod1(100);     //calling 3rd overloading method
	
	obj.overloadingMethod1();      //calling 1st overloading method
	
	overloadingMethod1(10,"abc");  //calling 4th Overloading Method
		
	overloadingMethod1("xyz", 100); //calling 5th Overloading Method
	
	obj.overloadingMethod1(10.0);   //calling 6th Overloading Method
	

}	
}
