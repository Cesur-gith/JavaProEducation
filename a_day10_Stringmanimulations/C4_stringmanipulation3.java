package a_day10_Stringmanimulations;

import java.util.Scanner;

public class C4_stringmanipulation3 {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		// - Girilen kelime cumlede kullanilmamis.
		 //- Girilen kelime cumlede 1 kere kullanilmis.
		 //- Girilen kelime cumlede 1’den fazla kullanilmis.

		Scanner scan = new Scanner(System.in);
        System.out.println("Kullanicidan bir cumle ve kelime giriniz ");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next().toLowerCase();
       
      
        int ilkkullanimIndexi=cumle.indexOf(kelime);//0
        int sonkullanimIndexi=cumle.indexOf(kelime);//16
        
        if(ilkkullanimIndexi==-1) {
        	System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (ilkkullanimIndexi == sonkullanimIndexi) {
        	System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");

        }else {
        	System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        
        scan.close();
        }
        }
        //System.out.println(cumle.indexOf("java") == -1 ? "Daha cok calisman lazim" 	: "Aferin";

	}


