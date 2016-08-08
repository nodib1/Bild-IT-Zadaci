package zadaci_4_08;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		
		double br1 = unos.nextDouble();
		double br2 = unos.nextDouble();
		double br3 = unos.nextDouble();
		
		unos.close();	

		System.out.println("Redosljed brojeva je: ");
		displaySortedNumbers(br1,br2,br3);

}
	public static void displaySortedNumbers( double num1, double num2, double num3){
		double[] array = {num1,num2,num3};
		double temp = 0;
		for(int i = 0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i=0; i<array.length; i++){
			System.out.printf("%4.2f%3s",array[i]," | ");
		}
	}
}
