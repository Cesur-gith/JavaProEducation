	package day02variableandscanner;

public class day02TypeCasting {

		/*
		 Type Casting:  We want to canvert a numbers primitive data type to another numbers primitive data type
		
		 Number primitive Data Types: byte <short< int< long< float <double (we can convert the numbers among these data types)	
		small to large or large to small 	
		*/

	public static void main(String[] args) {
		/*
		Auto Widening Type Casting: if you chnage small primitive data types to larger 
		it is called Auto Widening Type Castening
		*/
		byte b1 = 12;
		short s1 = b1;
		System.out.println(s1);
		
		int i1 = 123;
		float f1 = i1;
		System.out.println(f1);
	
		double d1 = 2.43;
		//Explicit Narrowing Type Casting: if you chnage large primitive data type to  smaller 
		float f2 = (float)d1;
		
		long l1 = 234;
		byte b2 = (byte)l1;
		
		System.out.println(l1);//234
		System.out.println(b2);//-22
		
		
		// How to convert "primitive data type " to "Wrapper class"
		
		// int -> Integer     				Integer -> int 
		
		//if you convert primitive to wrapper it is called "Auto Boxing" 
		int i2 = 123;
		Integer i2Wrapper = i2;
		System.out.println(i2Wrapper);
		//if you convert wrapper to primitive it is called "Unboxing" 
		Integer i3Wrapper = 234;
		int i3 = i3Wrapper; 
		
		
		
		
	}

}
