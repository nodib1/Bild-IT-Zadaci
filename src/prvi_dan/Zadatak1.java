package prvi_dan;

import java.util.ArrayList;
import java.util.Scanner;



public class Zadatak1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//declaring arrayList 
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("How many do You want elements in array?[type int value]");
		int n = in.nextInt();
		in.close();
		//adding elements to an array
		for(int i = 0; i<n; i++){
			list.add(((int)(Math.random()*100)));
		}
		
		//calling method max who returning max integer value form arrayList
		
		System.out.println("The biggest element in array is: "+max(list));
		
	}
	public static Integer max(ArrayList<Integer> list){
		int max = 0;
		
		//condition who checks if list is empty..
		//otherwise if list is not empty..else statement will occur
		
		if(list.isEmpty() == true){
			return null;
		}else{
			//this for loop is for finding biggest element 
			for(int i=0; i<list.size(); i++){
				if(list.get(i) > max){
					max = list.get(i);
				}
			}
			return max;
		}
		
		
	}//end of max method 
}
