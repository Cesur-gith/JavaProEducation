package a_day13_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {

		// kullanicidan 2 tam sayi isteyin
		// bu sayilarin toplamlarini ve carpimlarini
		// 2 ayri method da hesaplayip yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfn 2 tam sayi giriniz ");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		// method olusturmanin kolay yolu
		// method ismini ve parametreleri yazin (method call) ornek;

		toplama(sayi1, sayi2); // method call yaptim sadece ama creation yapmadim
		carpma(sayi1, sayi2);
		
//		carpma(sayi1 + 3, sayi2 * 2); // 8*12 = 96
//		toplama(sayi1 + 3, sayi2 + 1); //

		sayi1 = 20; // artik son atanan sayia bakarak islem yapar
		sayi2 = 15;

		toplama(sayi1, sayi2); // 20+15=35
		carpma(sayi1, sayi2); // 300

		sayi2 = 40; // son atanan sayi
		toplama(sayi1, sayi2);
		bolme(sayi1, sayi2);

		// Sonuc olarak uygulamaniza tekrar tekrar kullanmamiz gereken kod bloklari icin
		// her seferinde yeniden yazmak yerine bu blogu bir method da yazip
		// ihtiyacimiz oldugu her sefrede cagirmak daha mantiklidir

		scan.close();

		// BU 3 SORUYU CEVAp VERMEk GEREkIYOR!!!

		// 1- ben methoda ne gonderecegim - Ben metoda 2 sayi gonderecegim
		// 2- method ne yapacak - Method sayilari toplayip yazdiracak
		// 3- method ne dondurecek - yazdiravaksa dondurmeye gerek yok
	}

	// Bir method sadece konsolda birseyler yazdiracaksa return type olarak void
	// yazilir
	// bu durmumda return keyword e ihtiyac olmaz
	// ve Method bize bir sonuc dondurmez

	public static void toplama(int sayi1, int sayi2) {

		System.out.println("girilen sayilarin toplami : " + (sayi1 + sayi2));

	}

	public static void carpma(int sayi1, int sayi2) {

		System.out.println("girilen sayilarin carpimi : " + (sayi1 * sayi2));
	}
	
	public static void bolme(int sayi1, int sayi2) {
		
		System.out.println("girilen sayilarin bolme : " + (sayi1 / sayi2));
	}

}

/*
 * // Hocanin paylastig ilk kod
 * 
 * package day13_methodCreation; public class C1_MethodCreation01 { public
 * static void main(String[] args) { // bir method'u olusturmak o method'u
 * calistirmak icin yeterli degildir. // Eger bir method'u calistirmak
 * isterseniz // Method Call ( o method'u cagirmalisiniz)
 * 
 * // method call yapmak icin method'un adi ve varsa parametreleri yazilmalidir.
 * toplama(20,40);
 * 
 * // sadece method call yaptigimizda method calisir // eger method'un icinde
 * bir sey yazdiriiyorsak console'da o yaziyi goruruz
 * 
 * // ancak method'umuz return type'a sahipse bize bir sonuc return edecektir //
 * bu sonucu ya direk yazdiririz
 * 
 * System.out.println(toplama(15,20));
 * 
 * 
 * // veya donen sonucu bir variabla'a atayabiliriz int sonuc= toplama(10,15);
 * System.out.println(sonuc); }
 * 
 * 
 * public static int toplama(int sayi1, int sayi2) {
 * 
 * System.out.println("method calisti");
 * 
 * return sayi1+sayi2; } }
 * 
 */

/*
 * // Hocanin paylastigi 2ci kod
 * 
 * package day13_methodCreation; import java.util.Scanner; public class
 * C2_MethodCreation02 { public static void main(String[] args) { //
 * Kullanicidan 2 tamsayi isteyin // bu sayilarin toplamlarini ve carpimlarini
 * // iki ayri method'da hesaplayip yazdirin
 * 
 * 
 * 
 * Scanner scan=new Scanner(System.in);
 * System.out.println("Lutfen iki tamsayi giriniz"); int sayi1=scan.nextInt();
 * int sayi2=scan.nextInt();
 * 
 * // method olusturmanin kolay yolu // method ismini ve parametreleri yazin
 * (method call) toplama(sayi1,sayi2); // 11
 * 
 * carpma(sayi1,sayi2); //30 carpma(sayi1+3,sayi2*2); // 8*12=96
 * 
 * toplama(sayi1+3,sayi2+1); // 8+7 =15
 * 
 * sayi1=20; sayi2=15;
 * 
 * toplama(sayi1,sayi2); // 20+15=35 carpma(sayi1,sayi2); // 300
 * 
 * sayi2=40; toplama(sayi1,sayi2); // 20+40 =60
 * 
 * // Sonuc olarak uygulamanizda tekrar tekrar kullanmaniz gereken kod bloklari
 * icin // her seferinde yeniden yazmak yerine , bu blogu bir method'da yazip //
 * ihtiyacimiz oldugu her seferde cagirmak daha mantiklidir.
 * 
 * scan.close(); } // Bir method sadece konsolda birseyler yazdiracaksa return
 * type olarak void yazilir // bu durumda return keyword'une ihtiyac olmaz // ve
 * METHOD BIZE BIR SONUC DONDURMEZ
 * 
 * public static void carpma(int sayi1, int sayi2) {
 * System.out.println("girilen sayilarin carpimi : " + sayi1*sayi2); } public
 * static void toplama(int sayi1, int sayi2) {
 * System.out.println("girilen sayilarin toplami : " + (sayi1+sayi2));
 * 
 * } }
 * 
 * 
 */
