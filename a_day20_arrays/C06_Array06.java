package a_day20_arrays;

import java.util.Arrays;

public class C06_Array06 {

	public static void main(String[] args) {

		// Java, candir

		String str = "Java, candir.";

		// split methodu bize bir array doner
		// donnen array i ya direk yazdirmaliyiz

		System.out.println(Arrays.toString(str.split(",")));
		str.split(",");

		// veya method dann donen String barindiran br array oldugundan
		// bir array olusturup ona ssign edebiliriz

		String bolunmusLelimeArray[] = str.split(","); // Java _candir    //Burda kelime sayisini yazdirir bolsuk ve vergul ile birlikte
		System.out.println(bolunmusLelimeArray[1]);// () candir

		String bolunmusLelimeArray2[] = str.split("a");
		System.out.println(Arrays.toString(bolunmusLelimeArray2));// () candir
		System.out.println(bolunmusLelimeArray2.length); // 4 eleman

		String bolunmusLelimeArray3[] = str.split(""); //
		System.out.println(Arrays.toString(bolunmusLelimeArray3));
		
		String cumle = "Java ogren, rahat yasa"; // cumle kac kelimeden olusur bunu nasil bulabiliriz

		String LelimeArrayi[] = cumle.split(" ");// kelimeleri ayircaksianiz "space" ile ayiracaksini 
												// harfleri ayrirmak isterseniz "hiclikle" ayiracaksiniz
		
		System.out.println("Cumledeki kelme sayisi : " + LelimeArrayi.length);
		
		
		// harf sayisini yazdirmak icin // nokta ve vergullerden,bosluklarda krtulmak lazim
		
		String cumle2=cumle.replaceAll("\\W", "");
		System.out.println(cumle2);
		System.out.println(cumle2.length());//18
		
		String harfArrayi[]= cumle2.split("");
		System.out.println(harfArrayi.length);//18
		
		
		
		
		
	}

}
