package prvi_dan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args)  {
		Scanner in = new Scanner (System.in);
		int num1 = 0;
		int num2 = 0;
		boolean correct_input = false;
		while( !correct_input){
		try{
		
		System.out.println("Enter first number:");
		 num1 = in.nextInt();
		System.out.println("Enter second number:");
		 num2 = in.nextInt();
		System.out.println("The greatest common divisor is " + GreatestCommonDivisor (num1,num2) );
		correct_input = true;
		}catch(InputMismatchException ex){
		  System.out.println("You must enter integer number.\nPlease enter again:");
		  System.out.println("exc"+ex);
		  in.next();
		}
		}
		in.close();
		
		
	}
	
	public static int GreatestCommonDivisor (int number1, int number2){
		// The method return the greatest common divisor
		int commonDivisor = 0;
		
		
		for (int i =1; i<number1 && i< number2; i++){
			if (number1 %i ==0 && number2%i ==0){
				//find commonDivisor
				
				commonDivisor= i;
			}
		}
		return commonDivisor;
				
	}

	}


