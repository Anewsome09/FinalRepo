package customer;

import java.util.List;
import java.util.Scanner;

import commons.AModel;
import commons.AccountModel;
import manager.AccManager;

public class Employee {
	String savings = "Savings";
	String checkings = "Checkings";
	boolean quit = false;
//	String searchN;

	
	private AccManager manage = new AccManager();

	public void start() {
		
		Scanner in = new Scanner(System.in);
		
		do {
			// Present Menu
			viewMenu();
			System.out.println("Select an option");
			String input = in.next();

			switch (input) {
			case "1":
				viewAccount();
				break;
			case "2":
				searchAccount(in);
				break;
			case "3":
				addUser(in);
				break;
			case "4":
				deposit(in);
				break;
			case "5":
				withdraw(in);
				break;
			case "6":
				quit = true;
				break;
			case "7":
				login(in);
				break;
			default:
				System.out.println("Please select a valid input\n");
				break;
			}
		} while (!quit);
		
		in.close();
		System.out.println("Goodbye!");

//		makeWithdraw();
//		makeDeposit():

	}
	
	private void viewMenu() {
		System.out.println("1. View Accounts");
		System.out.println("2. Search Accounts");
		System.out.println("3. Add a New Account");
		System.out.println("4. Make a Deposit");
		System.out.println("5. Make a Withdraw");
		System.out.println("6. Quit and close");
	}
	
	//Option 1
	private void viewAccount() {
		
		
		List<AccountModel> accs = manage.findAll();
		printAcc(accs);
		
	}
	
	// Option 2
	private void searchAccount(Scanner in) {
		
		System.out.println("Enter the username of the account: ");
		String name = in.next();
		
		List<AccountModel> accs = manage.findAcc(name);
		printAcc(accs);
		
	}
	
	// Option 3
	private void addUser(Scanner in) {
		
		String customer = getInp("Customer Name:",in);
		String type = getInp("Checkings or Savings:",in);
		String name = getInp("Username:",in);
		String password = getInp("Password: ",in); 
		String deposit = getInp("deposit:",in);
		//TODO: handle invalid input (for negative deposit)
		AccountModel a = new AccountModel(4,customer,type,name,password,Double.parseDouble(deposit));
		try {
			manage.addUser(a);
			System.out.println("Added User Account");
		} catch (Exception e) {
			System.out.println("Error: unable to add user :"+e.getMessage());
		}
	}
	
	// Input for the Add Methods
	private String getInp(String newUser, Scanner in) {
		System.out.println(newUser);
		return in.next();
	}
	
	private Double getDepo(String newUser, Scanner in) {
		System.out.println(newUser);
		return in.nextDouble();
	}
	
	private void printAcc(List<AccountModel> b) {
		
		for(AccountModel a : b) {
			System.out.println("\n Name : \t"+a.getCustomer() +"\n Account Type : "+a.getType() +
					"\n Balance: \t$"+a.getBalance());
			System.out.println();
			}
	}
	
	//Option 4
	private void deposit(Scanner in) {
		
		System.out.println("Enter the username of the account: ");
		String name = in.next();
		
		System.out.println("Enter the amount to deposit: ");
		double amount = in.nextDouble();
				
		List<AccountModel> accs = manage.findAcc(name);
		for(AccountModel a1 : accs) {
				double balance = a1.getBalance()+amount;
				a1.setBalance(balance);
				printAcc(accs);
//				manage.updateB(a1);
			}
	}
	
	//Option 5
	private void withdraw(Scanner in) {
		System.out.println("Enter the username of the account: ");
		String name = in.next();
		
		System.out.println("Enter the amount to withdraw: ");
		double amount = in.nextDouble();		
		
		List<AccountModel> accs = manage.findAcc(name);
		for(AccountModel a : accs) {
				double balance = a.getBalance()-amount;
				a.setBalance(balance);
				printAcc(accs);
//				manage.updateB(a);
			}
	}
	
	//Login code
	public void login(Scanner in) {
		
		System.out.println("Enter the username of the account: ");
		String name = in.next();
		
		System.out.println("Enter the password: ");
		String password = in.next();		
		
		List<AccountModel> am = manage.findAcc(name);
		for(AccountModel a : am) {
				if (password == a.getPasswordr()) {
					System.out.printf(a.getCustomer(), a.getBalance());
				} else System.out.println("Invalid input.");
			}
		
	}
}
