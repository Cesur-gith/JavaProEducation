package a_day21_multi_dimantional_arrays;

public class C01MDArrays02 {

	public static void main(String[] args) {

		/*
		 * Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini
		 * ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
		 */

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		int carpim = 1;

		for (int i = 0; i < arr.length; i++) {// outer for loop olan arrayi kontrol edecek

			for (int j = 0; j < arr[i].length; j++) { // inner for loop

				carpim *= arr[i][j];
			}
		}
		System.out.println("Tum elementlerin carpimi " + carpim);


	}

}
