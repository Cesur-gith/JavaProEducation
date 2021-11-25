package Questions;

import java.util.Scanner;

public class FirstLetterUppercase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Write your name please...");
		String name = scan.nextLine();
		String upperCase = " ";
		Scanner scaner = new Scanner(name);
		
		while(scaner.hasNext()) {
			String word = scaner.next();
			upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1)+ " ";
		}
		
		System.out.println(upperCase.trim());
		
	}

}
