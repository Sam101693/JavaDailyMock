package stringclass;

public class RemovingAlphabet
{
	
	public static void main(String[] args) 
	{
		
		String str1 = "19Shivangi10";
		
		str1 = str1.replaceAll("[A-Za-z]", "");
		
		System.out.println(str1);
				
	}

}
