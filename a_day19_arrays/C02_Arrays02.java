package a_day19_arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0]
		// Ben bir kez olusturdugum in arrayin sonradan uzunlugunu degistirebilirmiyim ?

		// [0, 0, 0, 0, 0, 5]

		// arr [5] = 5;// Bu hata verir

		// array'in length'i sonradan degistirilemez
		// array'i kullnaisiz yapan da bu ozelligidir

		arr[2] = 1;
		System.out.println(Arrays.toString(arr));// [0,0,1,0,0]

		arr = new int[6]; // bu ekleme yapmaz 6 elementlik yeni bir array olusturur

		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]
		// bu yeni gelen array eski arrayi olduruyor ve yeni bir array olusturyor

		// ARRAY'in length'i DEGISTIRILEMEZ !!!

	}

}
