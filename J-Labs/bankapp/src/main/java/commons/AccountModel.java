package commons;


public class AccountModel {
		
	private int id;
	private String name;
	private String customer;
	private String type;
	private double balance;
	private String password;
	public String emp;
	
	public AccountModel() {
		super();
	}
	
	public AccountModel(String name) {
		super();
		this.name = name;
	}
		
	public AccountModel(int id, String name, String customer, String password, String type, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.customer = customer;
		this.password = password;
		this.type = type;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName(String name) {
		return name;
	}
	
	public String getPasswordr() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public AccountModel(String name, String password, String emp) {
		//this.id = id;
		this.name = name;
		this.password = password;
		this.emp = emp;
	}
}
