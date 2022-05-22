package collectiondiscussion;

public class ArrayListBasics 
{

	public static void main(String[] args) 
	{
		
		
		java.util.ArrayList<String> al_string = new java.util.ArrayList<String>();
		
		al_string.add("Abc");
		al_string.add("xyz");
		al_string.add("def");
		
		System.out.println(al_string);
		
		System.out.println(""+al_string.get(0)+" "+al_string.get(1));
				
		for(String str:al_string)
		{
			
			System.out.print(str+" ");
			
		}//for
		
			
	}//main
	
	
}//class
