package stringclass;

import java.util.Scanner;

public class StringMethods
{
	
	public static void main(String[] args) 
	{		
		//1.equals method
		
		String str = "";
		String str1 = " ";
		
		boolean result_equals = str.equals(str1);
		
		System.out.println(str);
		System.out.println(result_equals);//false
		
		
		
		//2.concat method
		
		String str2 = "Shivangi";
		String str3 = " Gosavi";
		
		String result_concat = str2.concat(str3);
		
		System.out.println(result_concat);//Shivangi Gosavi
			
		//3.equalsIgnoreCase method
		
		String str4 = "N!lesh";
		String str5 = "N!lesh";
		
		boolean result_equalsIgnoreCase = str4.equalsIgnoreCase(str5);
		
		System.out.println(result_equalsIgnoreCase); //true
		
		
		//4.length method
		
		String str6 = "Dharmadhikari";
		
		int result_length = str6.length();
		System.out.println(result_length); //13
		
		
		//5.charAt method
		
		String str7 = "Don't disturb my class";
		
		char result_charAt = str7.charAt(3); 
		
		System.out.println(result_charAt);//'
		
		
		//6.replace(char old, char new) method
		
		String str8 = "ABCD";
		String str9 = str8.replace('B', '!');
		System.out.println(str9);  //A!CD
		
		//7. replace(String old, String new) method
		
		String str10 = "Pogo";
		String str11 = str10.replace("go", "po");
		System.out.println(str11);   //Popo
		
		
		//8.substring(int index) method
		
		String str12 = "Gourav";
		String str13 = str12.substring(3);
		System.out.println(str13); //rav
		
		//9.substring(int begin index, int endindex) method
		
		String str14 = "Babu Bhaiya";
		String str15 = str14.substring(5, 11);
		System.out.println(str15); //Bhaiya
		
		//10.contains(String value) method
		
		String str16 = "Narendra Modi";
		Boolean str17 = str16.contains("odi"); 
		System.out.println(str17);//true
		
		
		//11.toLowerCase() method
		
		String str18 = "SoNia GaNdhi Ka PaPpu";
		String str19 = str18.toLowerCase();
		System.out.println(str19);  //sonia gandhi ka pappu
		
		
		//12.toUpperCase() method
		
		String str20 = "THe RAj ThAkRe";
		String str21 = str20.toUpperCase();
		
		System.out.println(str21); //THE RAJ THAKRE
		
		//13.indexOf(char ch) method
		
		String str22 = "Hindustani Bhau";
		int str23 = str22.indexOf('a');
		System.out.println(str23); //7
		
		//14.trim() method
		
		String str24 = "   BB ki Vines   ";
		String str25 = str24.trim();
		System.out.println(str25);  //BB ki Vines
		
		
		//15.split(String s)
		
		String str26 = "Virat Kohli";
		String str27[] = str26.split("Vi"); //Array
		//System.out.println(str27[0]);
		
		for(int i =0;i<str27.length;i++)
		{
			System.out.println(str27[i]);
		}
		
		//16.toCharArray()

		String str28 = "RCB is a winner!!! in dreams";
		
		char [] char_array = str28.toCharArray(); //str28 i.e String value converted into Character array
		
		System.out.println(char_array[2]);
		
		for(char h:char_array)
		{
			System.out.println(h);
			
		}
		
		//17. ValueOf(primitive datatype)
		
		int int_var =200;
		String str29 = String.valueOf(int_var);
		System.out.println(str29+90); //concat
		
		//18. Wrapper Class
		
		Scanner scanner =new Scanner(System.in);
		
		//System.out.println("Enter No = ");
		//int no = scanner.nextInt();
						
		String str30 = "10.7";
		float no1=Float.parseFloat(str30); //String to int data type conversion
		System.out.println(no1 + 10);//20.7
		
		
		//19.isDigit(char c)
		
		char char1 = '0';
		boolean bol1 = Character.isDigit(char1);
		
		System.out.println(bol1);//true
		
		//20.isAlphabetic(char c)
		
		char char2 = 'A';
		boolean bol2 = Character.isAlphabetic(char2);
	
		System.out.println(bol2);//true
		
		
		//20.replaceall(String s)
		
		String str31 = "Rrrrr!!!!!!!#$4455Ccccc&&&&&&BBBBBbbbbb";
		
		String str32 = str31.replaceAll("[0-9]","N");
		
		System.out.println(str32);//R!!!!!!!#$NNNNC&&&&&&B
		
		String str33 = str31.replaceAll("[A-Z]", "");
		
		System.out.println(str33); //rrrr!!!!!!!#$4455cccc&&&&&&bbbbb
		
		String str34 = str31.replaceAll("[a-z]", "9");
		
		System.out.println(str34);  //R9999!!!!!!!#$4455C9999&&&&&&BBBBB99999
		
		String str35 = str31.replaceAll("[^0-9]", "*");
		
		System.out.println(str35); //**************4455*********************
		
		
		String str36 = str31.replaceAll("[^A-Z]", "#");
		System.out.println(str36); //R#################C##########BBBBB#####
		
		String str37 = str31.replaceAll("[^a-z]", "@");
		System.out.println(str37);//@rrrr@@@@@@@@@@@@@@cccc@@@@@@@@@@@bbbbb
		
		
		String str38 = "fafafafafbbbcccxxxxxxxzzzzzz";
		
		String str39 = str38.replaceAll("[a-fx-z]","0");
		
		System.out.println(str39); //0000000000000000000000000000
				
	}//main 
	
}//class
