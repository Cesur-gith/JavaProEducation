package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class C07_For_Loop {

	public static void main(String[] args) {
		
		/*Interview Question 
		 * kullanicidan bir String isteyin ve string i tersten yazdirin
		 * */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz");
		String kelime = scan.nextLine();
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-1-i+1));
		
		
			scan.close();
}
	}
}
