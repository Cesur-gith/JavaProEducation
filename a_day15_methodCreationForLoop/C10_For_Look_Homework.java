package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class C10_For_Look_Homework {

	public static void main(String[] args) {

		// Soru 11 ) Interview Question
		// Kullanicidan 10’den kucuk bir sayi isteyin ve
		// girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk bir pozitif tamsayi yaziniz");

		int sayi = scan.nextInt();
		
		System.out.print(sayi + "! = ");
		
		int faktoryel = 1;
		for (int i = 1; i < sayi; i++) {
			
		System.out.print( i  +  " * ");
		faktoryel *= (i+1); // Anlamadim
		}
		
		System.out.println(sayi + " = " + faktoryel);
	
		scan.close();

	}

}
