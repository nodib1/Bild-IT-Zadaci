package zadaci_4_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		enterNumbers();

	}
		public static void enterNumbers() throws RuntimeException{
			Scanner in = new Scanner(System.in);
			int[] array = new int[100];
			boolean status = false;
			int uneseni_broj = 0;
			mainLoop:
			for(int i=0; i<100; i++){
				
				secondLoop:
					do{
				
						try{
							uneseni_broj = in.nextInt();
							status = true;
						}catch(RuntimeException ex){
							System.out.println("Pogresan unos.\nUnesi ponovo.");
							in.nextLine();
						}
					}while(status != true);
					
				if(uneseni_broj != 0 ){
					array[i] = uneseni_broj;
					
				}else{
					break mainLoop;
				}
			}
			mainMethod(array);
			
			
		}
		public static void mainMethod(int[] array){
			for(int i=0; i<array.length; i++){
				if(array[i] != 0 ){
					System.out.print(array[i]+" ");
				}
			}
		}
		
		
}
