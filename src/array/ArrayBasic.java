package array;

public class ArrayBasic
{
	public static void main(String[] args) 
	{
		
		//1st way to define array
		int a [] = new int [1];
	
		a[0] = 10;
		a[1] = 10;
		a[2] = 10;
			
		
		//advance for
		for(int j:a)
		{								
			System.out.println(j);
			
		}//for
		
		
		String str [] = new String [3];
		
		str[0] = "Mera";
		str[1] = "Bharat";
		str[2] = "Mera Bharat Mahan";
		
		for(String str1:str)
		{
			if(str1.equals("Mera Bharat Mahan"))
			{
				str1 = str1+34;
				System.out.println(str1);
			}
		}
		
		
		
			
	}//main method

}//class
