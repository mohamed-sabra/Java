public class PrimitiveDataTypes {
  public static void main(String[] args) {
   /*
	Data Type	Size		Description
	byte		1 byte		Stores whole numbers from -128 to 127
	short		2 bytes		Stores whole numbers from -32,768 to 32,767
	int			4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
	long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	float		4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	double		8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
	boolean		1 bit		Stores true or false values
	char		2 bytes		Stores a single character/letter or ASCII values
	*/
	byte byteNumber = 126;
	System.out.println("This is a byte number : " + byteNumber);
	
	short shortNumber = 32750;
	System.out.println("This is a short number : " + shortNumber);
	
	int intNumber = 2147483647;
	System.out.println("This is a int number : " + intNumber);
	
	long longNumber = 18000000000L; //you should end the value with an "L"
	System.out.println("This is a long number : " + longNumber);
	
	float floatNumber = 5.33f; //you should end the value with an "f"
	System.out.println("This is a float number : " + floatNumber);
	
	double doubleNumber = 19.33d; //you should end the value with a "d"
	System.out.println("This is a double number : " + doubleNumber);
	
	float f1 = 33e3f; // "e" indicates the power of 10
	double d1 = 13E4d; // "E" indicates the power of 10
	System.out.println("float Number with the power of 10 : " + f1);
	System.out.println("double Number with the power of 10 : " + d1);
	
	boolean isOpen = true;
	boolean isVaccinated = false;
	System.out.println("Open? " + isOpen);
	System.out.println("Vaccinated? " + isVaccinated);
	
	char mercedesClass = 'C';
	System.out.println("Mercedes-Benz car class : " + mercedesClass);
	
	//definition of char using ASCII values
	char a = 65, b = 66, c = 67;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
  }
}