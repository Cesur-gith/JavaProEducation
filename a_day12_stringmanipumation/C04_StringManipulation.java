package a_day12_stringmanipumation;

import java.util.Scanner;

public class C04_StringManipulation {

	public static void main(String[] args) {


		//kullanicidan 4 harfli bir kelime isteyin
		//4 harften uzun veya kisya ise "Lutfen 4 harfli bir kelime giriniz"
		// ve uygun kelime girildiyse kelimeyi tersden yazdirin 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime giriniz");
		String kelime=scan.nextLine(); 
		
		if(kelime.length()!=4) {
			System.out.println("lurfen 4 harfli bir kelime giriniz");
		}else {
			
			System.out.println(kelime.substring(3,4) + kelime.substring(2,3) +  // (3,4) sadece 3 demek yani 3 harfi alir
								kelime.substring(1,2) + kelime.substring(0,1));
		}
		
	}

}
