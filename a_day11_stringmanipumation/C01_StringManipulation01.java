package a_day11_stringmanipumation;

import java.util.Scanner;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a phrase please");
		String phrase=scan.nextLine().toLowerCase();

		System.out.println("Enter a noun please");
		String noun=scan.next().toLowerCase();
		
		//cumlede kelimenin kullanilip kullanilmadigini yazdirin
		//indexOf() kullanalim
		
		// Hem indexOf() hemde contains ile yapilir ama contains daha cok tercih edilir ve okumak 
		//daha kolay 
		
		if(phrase.indexOf(noun)>=0) { //!=-1
			
			System.out.println("Kelime cumlede kullanilmis");
			
		}else {
			System.out.println("Kelime cumlede kullanilmamis");
		}
		
		if (phrase.contains(noun)) {
			System.out.println("Kelime cumleden kullanilmis");
		}else {
			System.out.println("Kelime cumleden kullanilmamis");
			scan.close();
		}
		
	}

}
