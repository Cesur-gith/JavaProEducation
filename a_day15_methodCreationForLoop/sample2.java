package a_day15_methodCreationForLoop;

import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to have a factorial");
		int num=scan.nextInt();

		int factorial = 1;
		
		String factString = "";
		for (int count = num; count > 0; count--) {
			factorial = factorial * count;
			if (count == num) {
				factString += count;
			} else {
				factString += " * " + count;
			}
		}

		System.out.println("Factorial of " + num + "! = " + factString + " is " + factorial);
		System.out.println();

		scan.close();

	}

}
