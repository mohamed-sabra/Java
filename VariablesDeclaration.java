public class VariablesDeclaration {
  public static void main(String[] args) {
	  
	//declaration on multiple lines
	int x = 5;
	float aFloatNum = 5.99f;
	char aLetter = 'D';
	boolean aBooleanValue = true;
	String aStringText = "Hello";
	
	System.out.println("int variable = " + x);
	System.out.println("float variable = " + aFloatNum);
	System.out.println("char variable = " + aLetter);
	System.out.println("boolean variable = " + aBooleanValue);
	System.out.println("String variable = " + aStringText);

	//declaration on one line when the type is the same
	int a = 10, b = 10, c = 13; 
	System.out.println(a + b + c);
  }
}