package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number in order to have its factorial");
		
		int num = scan.nextInt();
		System.out.print(num + "! = ");

		
		int factorial = 1;
		for (int i=1; i < num; i++) { // Note: < instead of <=
			factorial *= i;
		    System.out.print(num + " * ");
		}
		factorial *= num;
		
		System.out.println(num + " = " + factorial);
	
		
		scan.close();

	}

}
