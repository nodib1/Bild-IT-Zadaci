package drugi__Dan;

import java.io.File;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws Exception{
		//Kreira se fajl objekta, a koristimo datoteku "novi.txt"
				File file = new File("novi2.txt");
				// Provjera da li postoji fajl
				file.createNewFile();
				if(file.exists()){
					System.out.println("Fajl postoji.");
				}
				else{
					System.out.println("Fajl ne postoji.");
				}
				
				//Kreira se scanner objekt za ucitavanje podataka iz odredjenog fajla
				Scanner in  = new Scanner(file);
				
				int line = 0; 			//brojac linija u tekstu
				int character = 0;		//brojac karaktera u tekstu
				int word =0;			//brojac rijeci u tekstu
				
				
				
				// Metoda hasNext() vraca boolean vrijednost ako ima jos podataka za citanje	
				while (in.hasNext()){
					String str = in.nextLine(); // kreira string do prebacivanja u novi red
					line++;						// broji linije u tekstu
					character += str.length();	// broji karaktere u tekstu
				}
				
				in.close(); // zatvara se scenner
				
				/*
				 * otvara se novi scanner sa istim fajmo da bi se 
				 * ponovo mogli porocitati podaci iz tekstualne datoteke
				 */
				in = new Scanner(file);		 
				
				while(in.hasNext()){
					in.next();  
					word++;	// brojimo slova u fajlu tako sto se preskace svaki space
					}
				in.close();
				
				System.out.println("U datoteci ima: ");
				System.out.println("Karaktera: "+character);
				System.out.println("Linija: "+line);
				System.out.println("Rijeci: "+ word);

	}

}
