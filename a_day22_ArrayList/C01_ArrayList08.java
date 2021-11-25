package a_day22_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C01_ArrayList08 {

	public static void main(String[] args) {

		String arr[] = { "3", "5", "7" };

		List<String> arrList = Arrays.asList(arr);

		System.out.println("list olarak " + arrList);

		arr[1] = "Ali"; // arrayin bir elemanini degistirdigimde
						// otomatik olarak listi de deistiriyor

		System.out.println("list olarak2 " + arrList);
		
		arrList.set(0, "Ayse");// biz listeden degstirmistik ama java array i de degistiryor
		
		
		System.out.println("list : " + arrList);
		System.out.println("array : " + Arrays.toString(arr));
		
		

	}

}
