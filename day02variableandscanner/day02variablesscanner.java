package day02variableandscanner;

public class day02variablesscanner {

	public static void main(String[] args) {

/*
		Data Types in Java
		Note: In Java, there are 2 main data types
		
		      1)Primitive Data Types: 
		      		a)boolean: It has 2 different values which are "true" and "false"
		      		           Every boolean variable uses a single "bit" in memory
		      		           booleans have "false" as default value
		      		b)char: It is used for single characters
		      				Value must be put between single quotes like 'S'
		      				Every char uses 16 bits in the memory
		      				
		      		c)byte : it is used for "whole numbers " btwn -128 and 127
		      				 it uses 8 bits from memory
		      				 if you are not sure that value will be btwn -128 and 127, do not use byte data type
		      				  	
		      		d)short : it is used for "whole numbers" btwn -32768 and 32767
		      		   		  it uses 16 bytes from the memory
		      		e)int : it is used for "whole numbers" btwn - 2,147,438,648 and 2,147,438,648 
		      			  : it uses 32 bits from the memory
		      		f)long : is used for "whole numbers" btwn -9,223,372,036,854,755,808 and  9,223,372,036,854,755,807
						   : it uses 64 bits from the memory
						   : every whole number is a "int" number for Java. when you crate a long variable, you have to put "L" to the end, to inform to java it is a long data type   	
		      		g)float : every decimal number is double for java and when you create float data type, you have to put "f" at th end of decimal number 
		      		h)double : it is used for "decimal numbers"
		      				 : it uses 64 bits from memory
		      		
		      Note: "=" is used to assign value to a variable
		            "==" is used to compare 2 values if they are equal to each other
		            "!=" means "not equal to"
		            
		      Note: If all values in an operation is integer the result will be integer in Java
		            If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part.
		            Java do not do "rounding" operation
		      
		      2)Non-Primitive Data Type
		*/
		
		byte age = 12;
		System.out.println("Age: " + age);//12
		
		short populationOfAVillage = 2000;
		System.out.println("population: " +populationOfAVillage);
		
		
		int profit = 2000000000;
		System.out.println("The profit: $" + profit);
		
		long numberOfCellsInAHuman = 65652836987654L;// if I put here "L" java understands that it is a long data type
		System.out.println("Number of cells in a human: " + numberOfCellsInAHuman);
		
		float f = 1.3f;
		System.out.println("Decimal Float: " + f);
		
		double d = 1.2;
		System.out.println("Decimal Double: " + d);
		
		//------------------------------------------------------------	
		//2)Non-Primitive Data Type

		String stdName = "Ali can"; // Multiple character with in ""
		
		System.out.println("Student name: " + stdName);
		System.out.println(stdName.toUpperCase());//ALI CAN
		System.out.println(stdName.toLowerCase());// ali can
		System.out.println(stdName.contains("i"));// true - that me says true because it contains "i" letter
		System.out.println(stdName.contains("x"));// false- it is false because it does not contain "x" letter
		
		
		
		
		
		
		
		
	}

}
