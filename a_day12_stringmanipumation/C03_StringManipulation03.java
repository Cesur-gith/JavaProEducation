package a_day12_stringmanipumation;

import java.util.Scanner;

public class C03_StringManipulation03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen sifrenizi giriniz");
		String sifre=scan.nextLine();
		
		//Bunu anlamadim
		boolean ilkHarfkont = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z' ;
		
		boolean sonHarfkontrol = sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)>='z'; 	
		
		boolean spacekontrol = !sifre.contains(" ");
		// basa ! koymazsak " " varsa true, " " yoksa false verir
		// basa ! koyarsak space olmadiginda true verir 
		
		
		boolean uzunlukkontrol = sifre.length()>=8;
		
		if(ilkHarfkont && sonHarfkontrol && spacekontrol && uzunlukkontrol) {
			System.out.println("Sifre basari ile tanimlandi");
			
		}else {
			
			System.out.println("Islem basarisiz, Lutfen yeni bir sifre giriniz");
		}
		
	}

}
