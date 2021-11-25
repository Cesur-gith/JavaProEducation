package a_day12_stringmanipumation;

public class C01_StringManipulation01 {

	public static void main(String[] args) {

		
		String str = "Java candir";
		
		System.out.println(str.substring(5));// candir
		System.out.println(str.substring(10));// r
		System.out.println(str.substring(11));// hiclik 
//		System.out.println(str.substring(20));// hata verir
		System.out.println(str.substring(5,8));// can
		System.out.println(str.substring(2,3));// v
		System.out.println(str.substring(5,5));// hiclik yazdiracak
		System.out.println(str.substring(5,11));// 5 dahil , 11 haric candir 
		
		String str1 = " Java ogrenmek cok guzel ";
		
		System.out.println(str);
		
	}

}
		
		/*
		String word = "Techproeducation";
		//It needs to separate the word into 3 parts "Tech pro education"
		String sub1 = word.substring(0,4);
		String sub2 = word.substring(4,7);
		String sub3 = word.substring(7,16);
		
		
		System.out.println("The sub of " + word + " [0,3) is : " + sub1);
		System.out.println("The sub of " + word + " [0,4) is : " + sub2);
		System.out.println("The sub of " + word + " [4,8) is : " + sub3);

//_____________________________________________________________________________________________
		
		// it needs to print "are"
		// it needs to print "roof"
		 * 
		String word1 = "Barefoot";
		String sub4 = word1.substring(1,4);
		String sub5 = word1.substring(2,3) + word1.substring(5,7) + word1.substring(4,5);

		System.out.println("The sub of " + word1 + " [1,4) is : " + sub4);
		System.out.println("The sub of " + word1 + " [1) is : " + sub5);
		*/

