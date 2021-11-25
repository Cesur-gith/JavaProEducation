package a_day17_While_Loop;


import java.util.Scanner;

public class C01_Nested_For_Loops01 {

	public static void main(String[] args) {
		
		// Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin 
		//ve girilen rakama gore asagidaki sekli cizdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		// kullanici 5 girmis olsun 
		
		for (int row = 1; row <= num; row ++) {
			for (int i = 1; i <=row; i++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		scan.close();
	
	}

}
