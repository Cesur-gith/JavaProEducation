package Questions;

import java.util.Scanner;

public class MethodCreation {

	public static void main(String[] args) {

		// musteri ismini ve soysiminin yazdirin
		// ismi veya soyisimlerinin ilk harferini buyuk ve diger kalanlarini kucuk yaziniz
		// ekrana ekrana isminizi 2 defa yazdiniz "Lutfen soyisminizi giriniz " yazsin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write your name please...");
		String clientName1 = scan.nextLine();
		clientName1 = nameCorrection(clientName1);
		
		System.out.println("Write your second name please...");
		String clientName2 = scan.nextLine();
		clientName2 = nameCorrection(clientName2);


		System.out.println("Write your surname please...");
		String clientSurname1 = scan.nextLine();
		clientSurname1 = nameCorrection(clientSurname1);


		System.out.println("Write your second surname please...");
		String clientSurname2 = scan.nextLine();
		clientSurname2 = nameCorrection(clientSurname1);

		
		System.out.println("Lutfen kredi kart numaranizi\narada bosluk olmadan yaziniz...");
		String kkNo = scan.next();

		String yeniKkNo = kkNoDuzelt(kkNo);
		
		
		System.out.println(clientName1 + " "  +  clientName2 + " "   + clientSurname1 + " " + clientSurname2 + "\n" + yeniKkNo);
		scan.close();

		}

	private static String nameCorrection(String clientName1) {
		{

			// Bu method'un amaci musteri ismini nasil yazarsa yazsin
			// ilk harf buyuk digerleri kucuk harf olacak sekilde duzenlemek
			// basta sonda bosluk birakmissa onlari da yokedlim

			clientName1 = clientName1.trim(); // atama yapmazsak degisiklik kalici olmaz
			clientName1 = clientName1.substring(0, 1).toUpperCase() + clientName1.substring(1).toLowerCase();
			clientName1 = clientName1.substring(0, 1).toUpperCase() + clientName1.substring(1).toLowerCase();
			// musteri Isminde yaptigim degisiklikleri main method'a gonderebilmek icin
			// return type'i void yerine variable'in data turune uygun bir sekle
			// dondurmeliyiz
			return clientName1;
		}
	}

	public static String kkNoDuzelt(String kkNo) {
		kkNo = kkNo.replace(" ", "");
		kkNo = kkNo.substring(0, 4) + " " + kkNo.substring(4, 8) + " " + kkNo.substring(8, 12) + " "
				+ kkNo.substring(12);
		return kkNo;

	}

}

/*
 * // musteri ismini ve soysiminin yazdirin // eger ismi ve soyisimi ayni ise //
 * ekrana isminizi 2 defa yazdiniz "Lutfen soyisminizi giriniz " yazsin
 * 
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Write your name please..."); String clientName =
 * scan.nextLine();
 * 
 * System.out.println("Write your surname please..."); String clientSurname =
 * scan.nextLine();
 * 
 * if ((clientName.contains(clientSurname))) {
 * System.out.println("You write your name twice. Write your surname pealse"); }
 * else { System.out.println("You name and surname are saved!"); }
 */
