package prvi_dan;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please, input some string?");
		String str = in.nextLine();
		in.close(); 
		
		
		int counter_of_vowels = 0; 				
		int counter_of_consonant = 0;
		int counter_of_space = 0;
		
		//this loop finds number of vowels and consonants in string 
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == ' ' || !Character.isLetter(str.charAt(i))){
				counter_of_space++;
			}
			//condition who counting vowels in string.
			//else condition counting consonants in string.
			if((str.charAt(i) == 'A' || (str.charAt(i) == 'a')) || (str.charAt(i) == 'E' || (str.charAt(i) == 'e')) || (str.charAt(i) == 'I' || (str.charAt(i) == 'i')) || (str.charAt(i) == 'O' || (str.charAt(i) == 'o')) || (str.charAt(i) == 'U' || (str.charAt(i) == 'u'))){
				counter_of_vowels++;
			}else{
				counter_of_consonant++;
			}
		}
		//this condition is used 'cause blank characters, numbers etc. is in counter_of_consonants variable
		//so we have to subtract those blank spaces, numbers etc to have the exact number of consonants.
		counter_of_consonant = counter_of_consonant-counter_of_space; 
		
		
		
		System.out.println("You have: "+counter_of_vowels+ " vowels in yout string."+
					"\nYou have: "+counter_of_consonant+" consonants in your string.");
	}
	
}
