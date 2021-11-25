package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class C05_For_Loop {

	public static void main(String[] args) {

		// Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin.
		// 1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari
		// yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100 kucuk bir pozitif sayi giriniz");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) { // i 1 den basliyacak

			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
		
				scan.close();

			}
		}
	}

}
