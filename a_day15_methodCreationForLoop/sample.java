package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 10 dan kucuk bir pozitif tam sayi girin ");
		
		int sayi=scan.nextInt();
		
		System.out.print(sayi + "! = ");
		
		int faktoryel=1;
		for (int i = 1; i < sayi; i++) {
			
			System.out.print( i + " * " );
			faktoryel*=(i+1);
			
		}
	    System.out.print(sayi + " = " +  faktoryel);
	
		scan.close();

	}
}


/*
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter a number pls"); int number = scan.nextInt();
 * 
 * for (int counter = 0; counter <= number; counter++) {
 * System.out.printf("%d! = %d\n", counter, factorial(counter)); } }
 * 
 * public static long factorial(long number) { if (number <= 1) return 1; else
 * return number * factorial(number - 1); }
 * 
 * }
 */
//	       int num, factorial = 1, i;
//	       
//	        Scanner in = new Scanner(System.in);
//	        System.out.println("Enter an Integer");
//	        num = in.nextInt();
//	         
//	        for (i = 1; i <= num; i++){
//	            factorial = factorial * i;
//	        }
//	         
//	        System.out.println("!" + num + " = " + factorial);
