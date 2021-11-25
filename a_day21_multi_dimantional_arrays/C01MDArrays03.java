package a_day21_multi_dimantional_arrays;


public class C01MDArrays03 {

	public static void main(String[] args) {

		/*
		 * Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son
		 * elemanlarin carpimini ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5},
		 * {6} }
		 */

		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

		int carpim = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j < arr[i].length; j++) { // so elementin indexi = lenght-1

				carpim *= arr[i][j];

			}
		}
		System.out.println(carpim);

	}

}
