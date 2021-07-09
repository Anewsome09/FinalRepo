
public class TestFib {
	
	public static void main(String[] args) {
		Fib fib = new Fib();
		
		int result = fib.fibonacci(1);
		System.out.println(result);
		
		result = fib.fibonacci(4);
		System.out.println(result);
		
		result = fib.fibonacci(8);
		System.out.println(result);
	}

}
