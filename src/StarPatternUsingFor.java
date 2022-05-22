import java.util.Iterator;

public class StarPatternUsingFor 
{
		
//	     * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 
//	* * * * * * 
	
	public static void main(String[] args) 
	{
		
		
		for(int i=0;i<=5;i++)
		{
			
			
			for(int j=5;j>=0;j--)
			{
				
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
				

			}//for(j)
			
			System.out.println();	
			
		}//for(i)
		
		System.out.println();
		for(int k=0;k<=5;k++)
		{
				
			for(int l=5;l>=0;l--)
			{
				
				if(l==5)
				{
					System.out.print("");
				}
				else if(l>=k)
				{
				System.out.print(" * ");
				}
				else 
				{
					System.out.print(" ");
				}
				
			
				
			}//for(l)
			
			System.out.println();

		}//for(k)
			
	}//main
	
	
}//class
