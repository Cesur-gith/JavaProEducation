package a_day15_methodCreationForLoop;


public class C02_For_Loop {

	public static void main(String[] args) {

		// 1O dan 20 kadar olan sayilari yazdiran bir loop olusturalim

		for (int i = 10; i < 20; i++) {
			System.out.print(i + " ");
		}

		// 100 ile 200 dahil aralarindaki 10 ile bolunen sayilari yzdirin
		System.out.println("");

		for (int i = 100; i <= 200; i += 10) {
			System.out.print(i + " ");
		}

		// 50 den 20 kadar sinirlar dahil 3 er geri sayalim
		System.out.println("");

		for (int i = 50; i >= 10; i -= 3) { // i = i-3
			System.out.print(i + " ");
		}

		// 50 ile 100 arasindan 3 ile bolunebilen sayilari yazdirin
		System.out.println("");

		for (int i = 50; i <= 100; i++) {
			if (i % 3 == 0) { // sayi 3 ile tam bolunuyorsa
				System.out.print(i + " ");
			
			}
			/*
			 * // eger degiskenimiz verilen artis veya azalisla bitis kosuluna ulasamiyorsa
			 * // sonsuz loop olusur ve system cokene kadar loop calismaya devam eder for
			 * (int a = 10; a < 20; a--) { System.out.println(a + " ");
			 */

			// eger baslangic degeri kosulu saglamiyorsa
			// loop body si hic calismadan loop'un sonuna gider
			// yani loop islevsiz olur

//			for (int j = 10; j < 0; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println("son");
			
		}

	}

}
