package a_day12_stringmanipumation;

import java.util.Scanner;

public class CO5_StringManipulation {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);
		//System.out.println("");
		
		String str1 = "$13.99";
		String str2 = "$10.55";
		
		str1 = str1.replace("$", "");
		str2 = str2.replace("$", "");
		
		
			
		System.out.println(str1 + str2); // hala string oldugu icin concatination yapti/ 
										 // String toplarken sonuc budur	13.9910.55
 
		
		Double sayi1 = Double.parseDouble(str1);
		Double sayi2 = Double.parseDouble(str2); 
		
		System.out.println("Iki sayinin toplami : $" + (sayi1+sayi2)); 
		
		//System.out.println(str2);
	
		
	}

}
