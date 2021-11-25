package a_day11_stringmanipumation;

import java.util.Scanner;

public class StringManipulationQuestion {

	public static void main(String[] args) {

	/*Kullanicidan bir cumle ve bir kelime isteyin, 
	 * kelimenin cumledeki kullanimina bakarak asagdaki 3 cumleden uygun olanini yazdirin
	 * - girilen kelime cumleden kullanilmamis
	 * - girilen gelime cumleden 1 kere kullanulmis
	 * - girilen kelime culeden 1 den fazla kullanillmis
	 */	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a phrase please!");
	String phrase= scan.nextLine().toLowerCase();

	System.out.println("Enter a verb please!");
	String verb = scan.next().toLowerCase();
	
	if (!phrase.contains(verb)){
    	System.out.println("The phrase does not contain verb");
    }else if (phrase.indexOf(verb)==phrase.lastIndexOf(verb)) {
    	System.out.println("The verb is used one time");
    }else{
    	System.out.println("The verb is used more than one time");
   
    	scan.close();
    }

	}
}
