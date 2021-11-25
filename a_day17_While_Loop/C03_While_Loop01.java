package a_day17_While_Loop;

public class C03_While_Loop01 {

	public static void main(String[] args) {

		
		/*Soru 1 ) While loop kullanarak 
		 * 3 den 13 e kadar dahil tum tek tamsayilari ekrana yazdiriniz.*/
		
		int a = 1;
		while (a <= 20) {
			if(a%2==1) {
			System.out.print(a + " ") ;	
			}	
			a++;
		}
	}

}
