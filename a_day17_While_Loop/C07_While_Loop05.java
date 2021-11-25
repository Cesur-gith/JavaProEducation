package a_day17_While_Loop;

import java.util.Scanner;

public class C07_While_Loop05 {

	public static void main(String[] args) {

		/*
		 * kullanicidan toplama uzere sayi isteyin toplam 200 oluncaya kadar sayi
		 * istemeye devam edin toplam 200 u gectiginde kullanicinin kac sayi girdigini
		 * ve bu sayilarinin toplaminin kac oldugunu yazdirin
		 */
		// 3 sayi girdigini ve toplamlari 230

		// For loop ta bir islem yapmak icin tekrar sayisini bilmek lazim
		// while loop ta is adim sayisi degil, bitirme kosulu onemlidir.

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int sayac = 0;

		while (toplam < 200) {
			System.out.println("Lutfen toplamak icin bir tam sayi giriniz");
			sayi = scan.nextInt();

			toplam += sayi;
			sayac++;
		}
		// toplamin 200 u gectiginden eminiz

		System.out.println("toplam " + sayac + " adet sayi girdiniz ve bu sayilarin toplami : ");

		scan.close();

		// *** eger adim sayisi bilinmiyr ve ongorulemiyorsa for loop degilde
		// while loop kullanmak daha mantiklidir

		// eger adimlar belliyse for loop kullanmak daha mantikli olabilir
		// iki fazla satir yazmaktan veya degisimi unutup sonsuz loop ' a girmekten
		// kurtulmus oluruz
	}

}
