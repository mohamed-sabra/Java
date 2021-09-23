public class FinalVariables {
  public static void main(String[] args) {
	  
	final String passportName = "MOHAMED";
	//passportName = "MOHAMAD";
	// During compilation, the above line will generate the error: cannot assign a value to a final variable!	
	
	/* Here's the error generate while I tried to compile the code
	C:\Users\mosabra\Desktop\Java\Java>javac FinalVariables.java
	FinalVariables.java:5: error: cannot assign a value to final variable passportName
    passportName = "MOHAMAD";  // While executing, this line will generate the error: cannot assign a value to a final variable!
        ^
	1 error
	*/
	System.out.println("Your Passport Name is Final and cannot be modified!");
	System.out.println(passportName);	
  }
}