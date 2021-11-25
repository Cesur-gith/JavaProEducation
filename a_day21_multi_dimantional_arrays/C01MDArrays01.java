package a_day21_multi_dimantional_arrays;

import java.util.Arrays;

public class C01MDArrays01 {

	public static void main(String[] args) {

		int arr [][] = {{1}, {2,3,4}, {5,6,7,8}}; // outer array is 0,1,2
		// bu arrayi nested for loop ile yazdiralim
		
		for (int i = 0; i < arr.length; i++) {// bu loop outer array'in elementlerini getirir
			
			// arr[i] // arr [0],arr [1],arr [2] leri verecek - sadece arr ile cozemeyiz
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
					
			System.out.println("");
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
		
		
		
		
		
		
		
		
		
	}

}
