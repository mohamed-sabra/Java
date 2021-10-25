public class Operators {
  public static void main(String[] args) {
    System.out.println("Java Operators");
	
	int a = 30 + 50;
	int b = a + 10;
	int c = a + b;
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	
	//Arithmetic operators + - * / % ++ --
	
	int x = 5;
	int y = 2;
	
	System.out.println("x is " + x);
	System.out.println("y is " + y);

	System.out.println("x+y is " + (x + y));//Addition
    System.out.println("x-y is " + (x - y));//Subtraction
    System.out.println("x*y is " + (x * y));//Multiplication
    System.out.println("x/y is " + (x / y));//Division
    System.out.println("x%y is " + (x % y));;//Modulus //Returns the division remainder
    System.out.println("++x is " + (++x));//Increment by 1
	System.out.println("--x is " + (--x));//Decrement by 1

	//Assignment operators = += -= *= /= %= &= |= ^= 
	int w;
	
	w = 33;
	System.out.println("w = " + w);

	w += 3;
	System.out.println("w += 3 is " + w);

	
	w = 33;
    w -= 3;
	System.out.println("w -= 3 is " + w);

	w = 33;
    w *= 3;
	System.out.println("w *= 3 is " + w);
	
	w = 33;
	w /= 3;
	System.out.println("w /= 3 is " + w);
	
	w = 33;
    w %= 3;
	System.out.println("w %= 3 is " + w);
	
	/*note ! (for comparing conditional statements)
	& operator: It evaluates all conditions even if they are false.
	Thus, any change in the data values due to the conditions will only be reflected in this case.
	Same for the Or Operator |
	*/
	
	//Bitwise operators &= >>= <<= (shifting bits)
	//As a Bitwise AND: & operator is used for adding Bitwise numbers in Java. Bitwise numbers are binary numbers stored in the form of integers
	w = 33;
	w &= 3;
	System.out.println("w &= 3 is " + w);
	
	w = 33;
	w >>= 3;
	System.out.println("w >>= 3 is " + w);

	w = 33;
	w <<= 3;
	System.out.println("w <<= 3 is " + w);
	
	w = 33;
	w ^= 3; //Boolean logical Exclusive OR
	System.out.println("w ^= 3 is " + w);
	
	w = 33;
	w |= 3; //Boolean logical Inclusive OR
	System.out.println("w |= 3 is " + w);

	//Comparison operators == != > < >= <=
	w = 33;
	System.out.println("w is " + w);
	System.out.println("w == 33 is " + (w == 33));
	System.out.println("w != 33 is " + (w != 33));
	System.out.println("w > 33 is " + (w > 33));
	System.out.println("w < 33 is " + (w < 33));
	System.out.println("w >= 33 is " + (w >= 33));
	System.out.println("w <= 33 is " + (w <= 33));
	
	//Logical operators && || !
	System.out.println("w > 3 && w < 50 is " + (w > 3 && w < 50));
	System.out.println("w > 33 || w < 50 is " + (w > 33 || w < 50));
	System.out.println("!(w > 33 || w < 50) is " + !(w > 33 || w < 50));

  }
}