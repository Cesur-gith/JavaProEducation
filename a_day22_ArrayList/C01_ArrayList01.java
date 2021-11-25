package a_day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList01 {

	public static void main(String[] args) { // java.util = bir kutuphane

		List<String> isimler = new ArrayList<>();
		// ad() listening sonuna ekleme yapar

		isimler.add("Ali");
		System.out.println(isimler); // Ali
		isimler.add("Veli");
		isimler.add("Ayse");
		isimler.add("Fatma");
		isimler.add("Ali"); // Ali

		System.out.println(isimler);

		// ozel bir index e eklemek isterseniz O zmn index li add method unu
		// kullanmaliyiz
		isimler.add(3, "Nihan");
		System.out.println(isimler);
		isimler.add(0, "Mehmet");
		System.out.println(isimler);

		List<String> yeniList = new ArrayList<>();
		yeniList.add("Firat");
		System.out.println(yeniList); // [Firat]

		// yeniList in sonuna isimler listesini eklemek istersek

		yeniList.addAll(isimler);
		System.out.println(yeniList);// [Firat, Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali]

		// birde intiger elementleri oldugu liste olusturalim

		List<Integer> sayilar = new ArrayList<>(); // int primitive, Integer wrapper class, non-primitive
		sayilar.add(5);

		// yeni list e sayilar listini ekleyebilirmiyim ?
		// farkli bir data tipinden liste veya element ekleyemeyiz

		// yeniList.addAll(sayilar);

	}

}
