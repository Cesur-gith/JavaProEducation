package Questions;

import java.util.Scanner;

public class uppercasefirstletter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
	    System.out.print("Enter name: ");
	    String name = sc.nextLine();
	 
	    String first = name.substring(0, name.indexOf(" "));
	    String last = name.substring(name.indexOf(" ") + 1);
	 
	    String cap = Character.toString(first.charAt(0)).toUpperCase();
	    first = cap + first.substring(1);
	 
	    cap = Character.toString(last.charAt(0)).toUpperCase();
	    last = cap + last.substring(1);
	 
	    System.out.println(name);
	    System.out.println(first);
	    System.out.println(last);
	  
		
	}

}
