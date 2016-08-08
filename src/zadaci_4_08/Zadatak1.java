package zadaci_4_08;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//scanner objekat za unos sa tastature..
		boolean provjera = false;
		//boolean varijabla sluzi za provjeru unosa
		int numb = 0;
		
		
		//do-while petlja nam sluzi da provjerava unos 
		//sve dok unos ne bude ispravan do-while petlja se izvrsava
		
		do{		
			
		//try block za provjeru eventualnih exception-sa
		try{
			
		System.out.println("Please enter a integer digit.");
		
		numb = in.nextInt();
		provjera = true;
		}catch(InputMismatchException ex){
			System.out.println("Wrong input.\nPlease enter again.");
			in.nextLine();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		}while(provjera != true);	
		
		in.close(); 		//zatvaramo scanner objekat,, ova linija se izvrsava kada je unos tacan
		
		
		//deklarisemo arraylistu u koju cemo da spremimo nase najmanje faktore
		ArrayList<Integer> list = new ArrayList<>();		
		
		//varijabla 'i' predstavlja djelioc(faktor) od kojeg krecemo
		
		int i = 2;
		//varijabla new_numb sluzi za spremanje pocetnog broja,,koji nam treba za provjeru
		
		int new_numb = numb;	
		
		
		while(true){
			//provjera da li je pocetni broj djeljiv sa varijablom 'i' ako jeste ulazimo u if-blok..
			//ako nije djeljiv idemo u else-blok koji povecava varijablu 'i' za jedan..
			if(numb % i == 0){	
				//ovdje smo dobili prvi faktor,, djelimo pocetni broj koji dobija novu vrijednosti
				numb = numb/i;			
				
				list.add(i);	//spremamo prvi faktor u listu...
				
				
				//ovaj if uslov sluzi nam za provjeru,,tj. kada su svi faktori pomnoze da li dobijemo pocetni broj
				//kada dobijemo pocetni broj to je ujedno i kraj program if uslov se izvrsava i break prekida while
				//petlju
				if(checkPositiveNumber(list) == new_numb){
					break;
				}
				
				//else uslov se izvrsava kada pocetni broj nije djeljiv sa faktorom 'i'
			}else{
				i++;
			}
			
		}//kraj while petlje
		
		System.out.print("Najmanji faktori broja "+new_numb+" su: ");
		for(Integer e : list){
			System.out.print(" "+e+" | ");
		}
		
	}
	public static int checkPositiveNumber(ArrayList<Integer> list){
		//varijablu broj incijalizujemo sa prvim elementom[faktorom] u listi
		//koji mijenja vrijednost sve dok ne bude jednak pocetnom broju
		int broj = list.get(0);
		
			//for petlja mnozi sve elemente u listi sve do pocetnog broja[unijetog]
			for(int i=1; i<list.size(); i++){
				broj = broj * list.get(i);
			}
			
			return broj;
			
		}//kraj metode
		
	}
