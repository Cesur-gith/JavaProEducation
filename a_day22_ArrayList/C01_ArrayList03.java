package a_day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList03 {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();

		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");

		isimler.set(1, "Fatma");
		System.out.println(isimler);

		System.out.println(isimler.set(2, "Mehmet")); // Zeki gider ve dellil olarak getirdi

		System.out.println(isimler);

	}

}
