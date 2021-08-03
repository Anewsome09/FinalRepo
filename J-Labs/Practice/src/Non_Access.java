
public class Non_Access {
    // <-- this notation specifies a comment
	public boolean a; // this variable can be accessed anywhere, on an object of type Example
	protected byte b = 7; // accessible within com.revature.mypackage or subclasses of Example
	static int c = 8; // class scope with default access
	private String d = "Hey"; // can only be accessed within this class
	
	public static void main(String[] args) {
		Non_Access myExample = new Non_Access();
		myExample.printValues();
		// prints out the default values:
		// The value of a is: false
		// The value of b is: 0
		// The value of c is: 0
		// The value of d is:
	}
	
	public void printValues() {
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		System.out.println("The value of c is: " + c);
		System.out.println("The value of d is: " + d);
	}
}
