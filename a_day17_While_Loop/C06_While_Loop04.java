package a_day17_While_Loop;

import java.util.Scanner;

public class C06_While_Loop04 {

	public static void main(String[] args) {

		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
		// yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam pozitif sayi girin ");

		int sayi = scan.nextInt();

		int i = sayi;
		int rakamlarToplami = 0;
		int rakam = 0;
		while (i > 0) {

			rakam = i % 10;
			rakamlarToplami += rakam;
			i /= 10;
		}
		System.out.println("Girdiginiz " + sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}
