package practice;

public class Operators {

	
	public static void main(String[] args) {
		
		
		//1. Arithmethic Operator 
		
		
		//A. Addition Operator
		
		int addno1 = 10, addno2 = 20;
		int add = addno1 + addno2;
		
		
		System.out.println("****Addition of 2 nos*****  = "+add);
		
		
		//B. Substraction Operator
		
		int subno1 = 500, subno2 = 1000;
		int sub = subno2 - subno1;
		
		System.out.println("****Substraction of 2 nos*** = "+sub);

		
		
		//C. Multiplication Operator 
		
		int mulno1 = 4, mulno2 = 5;
		int mul = mulno1*mulno2;
		
		System.out.println("*********Multiplication of 2 nos**************** = "+mul);
		
		
		
		
		//D. Division Operator
		
		double divno1 = 34, divno2 = 90;
		double div = divno1/divno2;
		
		System.out.println("*********Division of 2 nos**************** = "+div);
		
		
		//E. Modulus Operator
		
		int mod1 = 2, mod2 = 8;
		int mod = mod2%mod1;
		
		System.out.println("*********Modulus of 2 nos**************** = "+mod);
		
		
		
		//Conditional Operator 
		
		//1.Greater than '>' Operator
		
		int greatno1 = 90, greatno2 = 90;
		
		boolean greatresult = greatno1 > greatno2;
		
		System.out.println("***********Greater than Operator(no1 = 90 and no2 = 90)******************* = "+greatresult);
		
		//2.Less than '<'Operator
		
		int lessno1 = 67, lessno2 = 77;
		boolean lessrrsult = lessno1 < lessno2;
		
		System.out.println("Less than Operator(no1 = 67 and no2 = 77)"+lessrrsult);
		
		//3. Greater than or equal to '>=' Operator 
		
		int greatthanno1 = 33, greatthanno2 = 90;
		boolean greaterthanresult = greatthanno1 >= greatthanno2;
		
		System.out.println("*************Greater than or equal to Operator(no1 = 33 and no2 = 90)"+greaterthanresult);
		
		//4. Less than or equal to '<=' Operator
		
		int lessthanno1 = 45, lessthanno2 = 90;
		boolean lessthanresult = lessthanno1 <= lessthanno2;
		
		System.out.println("*************Less than or equal to Operator(no1 = 45 and no2 = 90)"+lessthanresult);
		
		
		//5. Equal to '=='Operator 
		
		int equaltono1 = 90, equaltono2 = 90;
		boolean equaltoresult = equaltono1 == equaltono2;
		
		System.out.println("*************Equal to Operator(no1 = 90 and no2 = 90)"+equaltoresult);
		
		//6. Not Equal to '!=' Operator 
		
		int notequaltono1 = 40, notequaltono2 = 90;
		boolean notequaltoresult = notequaltono1 != notequaltono2;
		
		System.out.println("*************Not Equal to Operator(no1 = 40 and no2 = 90)"+notequaltoresult);
		

		
		//Logical Operator 
		
		//A. AND Operator(&&)
		
		int andno1 = 89, andno2 = 78, andno3 = 89, andno4 = 78;
		boolean andresult = (andno1 == andno3 && andno2 == andno4);
		
		
		System.out.println("******AND Operator********");
		System.out.println(andresult);
		
		//B. OR Operator(||)
		
		int orno1 = 30, orno2 = 90, orno3 = 30, orno4 = 33;
		boolean orresult = (orno1 >= orno3 || orno2 >= orno4);
		
		System.out.println("*******OR Oerator***********");
		System.out.println(orresult);
		
		
		//C. NOT Operator(!)
		
		int notno1 = 10, notno2 = 20;
		boolean notresult = !(notno1 == notno2);
		
		System.out.println("******NOT Operator**********");
		System.out.println(notresult);
		
		
	}

	
}
