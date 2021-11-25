package Questions;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		System.out.println("Write your name please...");
		String clientName1 = scan.nextLine();

		clientName1 = nameCorrection(clientName1);

		System.out.println(clientName1);
		scan.close();

	}

	private static String nameCorrection(String clientName1) {
		{

			clientName1 = clientName1.trim(); // atama yapmazsak degisiklik kalici olmaz

			clientName1 = clientName1.substring(0, 1).toUpperCase() + clientName1.substring(1).toLowerCase();

			return clientName1;
		}
	}
}
