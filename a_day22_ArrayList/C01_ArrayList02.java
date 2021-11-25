package a_day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList02 {

	public static void main(String[] args) {

		List<Integer> sayilar = new ArrayList<>();

		sayilar.add(10);
		sayilar.add(20);

		System.out.println(sayilar.size());
		System.out.println(sayilar.isEmpty());
		System.out.println(sayilar);

		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar); // [10,20,30,40]

		// remove methodu iki turlu kullanilir
		// 1 - silmek istedigmimiz elemanin index ini yazarsak
		// o elemani siler ve delil olarak sildigini bize bildirir
		System.out.println(sayilar.remove(2));

		int silinenEleman = sayilar.remove(2);

		System.out.println(sayilar); // [10, 20, 40]

		sayilar.add(silinenEleman);
		System.out.println(sayilar);

		List<String> isimler = new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");

		System.out.println(isimler.remove("Zeki")); // true
		System.out.println(isimler); // [Ali, Ayse]

		isimler.remove("Ayse");
		System.out.println(isimler); // [Ali]

		boolean sonuc = isimler.remove("Mehmet");
		if (sonuc) {
			System.out.println("Mehmet i buldum ve sildim");
		} else {
			System.out.println("Mehmet i buldamadim ve sildimemedim");
		}

		isimler.remove(0);

		System.out.println(isimler); // []s

		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");

		System.out.println(isimler); // [Ali, Ayse, Zeki]

		isimler.removeAll(isimler);

		System.out.println(isimler); // []

	}

}
