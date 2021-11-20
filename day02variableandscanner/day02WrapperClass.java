package day02variableandscanner;

public class day02WrapperClass {

	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * 	primitive Data(There is not method)		Wrapper Class // it helps to use different methods "Wrapper classes are non primitive classes"
		 * 	   	boolean 								Boolean	
		 * 		char 									Character
		 * 		byte									Byte
		 * 		short 									Short
		 * 		int 									Int			
		 * 		long									Long
		 * 		float									Float
		 * 		double									Double
		 * 
		 * */

		
		boolean primitiveBoolean = true;
		
		Boolean nonprimitiveBoolean = true;
		
		System.out.println(nonprimitiveBoolean.equals(true)); // true
		System.out.println(nonprimitiveBoolean.equals(true)); // true
		
		char c1 = 'A';
		
		Character c2 ='A';
		c2.charValue();
		System.out.println(c2.charValue());//A

		byte b1 = 12; // if you see yellow underline that means that you did not use them
		
		Byte b2 = 12;
		
		System.out.println(b2.MAX_VALUE); //127
		System.out.println(b2.MIN_VALUE); //-128
		
		
		short s1 = 123;
		Short s2 = 123;
		Short s3 = 125;
		System.out.println(s2.compareTo(s3)); // CompareTo() method returns 0,if th numbers are equal to each other
											  // CompareTo(s3) method returned -2 for 123 and 125, it means s2-s3 
											  // CompareTo(s3) method returned 3 for 123 and 125, it means s2-s3 			
										
	
		Integer i1 = 1234;
		System.out.println(i1.MIN_VALUE);
		
		Long l1 = 12345L;
		System.out.println(l1.BYTES);//8 (8 bytes)
		
		Float f1 = 1.23f;
		System.out.println(f1.BYTES); // 32 bits = 4 Bytes
		
		Double d1 = 23.456;
		System.out.println(d1.MAX_VALUE);// 1.7976931348623157E308

		
		// wrapper classes are helping to use methods.  
		
		
	}	

}
