package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class C09_For_Loop {

	public static void main(String[] args) {

		// Soru 11 ) Interview Question
		// Kullanicidan 10’den kucuk bir sayi isteyin ve
		// girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk bir pozitif tamsayi yaziniz");

		int sayi = scan.nextInt();

		int faktoryel = 1;

		for (int i = 1; i <= sayi; i++) {
			faktoryel *= i;
		}
		System.out.println("Girdiginiz sayinin faktoryeli : " + faktoryel);

		// bu islemin sonucunda knsolda kullanici mesela 5 girdiyse 5! = 1*2*3*4*5 = 120
		// yazdirin

		
		scan.close();

	}

}
