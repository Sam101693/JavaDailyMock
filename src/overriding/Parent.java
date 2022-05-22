package overriding;

public class Parent {

	
 public void money()
 {
	 System.out.println("Money Method Executed!!!");	 
 }
 
 static int marry()
 {
	 
	 System.out.println("Marry Method Executed!!!");
	 return 0;
 }

 public static void main(String[] args) 
{
	 
	 Parent obj = new Parent();
	 obj.money();
	 marry();
	
}
	
	
	
}
