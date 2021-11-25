package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class C08_For_Loops {

	public static void main(String[] args) {

		/*
		 * Interview Question kullanicidan bir String isteyin ve string i tersten
		 * ceviren bir program yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz");

		String kelime = scan.nextLine();

		String terstenkelime = "";

		for (int i = 0; i < kelime.length(); i++) {

			terstenkelime += kelime.substring(kelime.length() - 1 - i, kelime.length() - i);
		}
		System.out.println(terstenkelime);
		
		
		scan.close();

	}

}
