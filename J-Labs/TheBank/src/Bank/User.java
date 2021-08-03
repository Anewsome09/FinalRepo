package Bank;

import java.util.Scanner;



public class User {
	static float deposit = 0.00f;
	static char makeDeposit;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First and Last name: ");
		String userName = scanner.next();
		System.out.println("Would you be able to make a deposit?"
				+ " If yes, please submit the amount.");
		deposit = scanner.nextInt();
		makeDeposit = scanner.next().charAt(makeDeposit);
		System.out.println(deposit);
	}
}


