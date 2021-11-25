package a_day13_methodCreation;

public class C1_MethodCreation {

	public static void main(String[] args) {
		// Bir method u olusturmak o method u calistirmak icin yeterli degildir
		// Eger bir method u calistirmak istiyorsaniz
		// Method call (o methodu cagirlmalisiniz)

		// method call yapmak icin methodin adi ve parametresi yazilmali
		//

		toplama(20, 40);

		// sadece method call yazdigimizda method calisir
		// eger methodun icinde bir sey yazdiriyorsak ekranda consol'e da oyaziyi
		// goruruz

		// ancak methodumuz return type a sahipse bize bir sonuc return edecektir
		// bu sonucu ya direk yazdiririz

		System.out.println(toplama(15, 20));
		
		//veya donen sonucu bir variable a atayabilirz
		
		int sonuc = toplama(10,20);
		System.out.println(sonuc);
		
	}

	public static int toplama(int sayi1, int sayi2) {
		System.out.println("Method calisti");
		return sayi1 + sayi2;

	}
}