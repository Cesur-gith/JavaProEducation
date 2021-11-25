package a_day10_Stringmanimulations;

import java.util.Scanner;

public class C1_stringmanipulation2 {

	public static void main(String[] args) {
		//Kullanicindan bir Strign isteyin
		//girdigi String "Java" iceriyorsa Aferin yazdirin
		//Icermiyorsa daha cok calisman lazim
		// buyuk kucuk harf onemsiz olsun
		
		Scanner scan = new Scanner(System.in);
	 	
        System.out.println("Lutfen bir String giriniz: ");
        
        String str = scan.nextLine().toLowerCase();
       
        // birinci yol
        if (str.indexOf("java")>=0) { 
            
            System.out.println("Aferin");
        } else {
            System.out.println("cok calisman lazim");
        
          scan.close();  
        }
      
        // 2 ci yol
        
        //Calistiramadim
        // System.out.println(str.indexOf("java")>=0  ? "Daha cok calisman lazim" 	: "Aferin";
        
        
        // 4 cu yol
//        switch (cümle.indexOf("java")) 
//        {
//        case -1:
//            System.out.println("daha cok calışman lazım");
//            break;
//        default:
//            System.out.println("java");
        
	}

}
