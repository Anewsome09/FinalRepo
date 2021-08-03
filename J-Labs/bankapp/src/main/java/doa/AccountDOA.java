package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import commons.AModel;
import commons.AccountModel;
import commons.DButil;


public class AccountDOA {
	
	public int id;
	public static String name;
	public static double balance;
	public static String customer;
	public static String type;
	private static String password;
	public static char activate = 'Y';
	private static String accTable = "select * from bankapp.customer_acc";
	private static String fullTable = "SELECT * from bankapp.customer_login\r\n"
			+ "	INNER JOIN bankapp.customer_acc\r\n"
			+ "	ON bankapp.customer_login.c_id = bankapp.customer_acc.acc_id";

	
	// Check to see if name is Available
	private boolean isNameAv(String name) {
		return name != null && !name.isEmpty();
	}
	
	public List<AccountModel> findAll(){
		List<AccountModel> acc = new ArrayList<AccountModel>();
		
		try {
			Connection con1 = DButil.getInstance().getConnection();
			Statement stmt = con1.createStatement();
			
			ResultSet rs1 = stmt.executeQuery(fullTable);
			
			while(rs1.next()) {
				id = rs1.getInt("acc_id");
				name = rs1.getString("cus_id");
				customer = rs1.getString("name");
				password = rs1.getString("password");
				type = rs1.getString("Account_type");
				balance = rs1.getInt("balance");
				AccountModel a = new AccountModel(id, name, customer, password, type, balance);
				acc.add(a);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}
	
	public List<AccountModel> findAcc(String name){
		List<AccountModel> accSingle = new ArrayList<AccountModel>();
		
		try {
				Connection con2 = DButil.getInstance().getConnection();
				
				String qry = accTable;
				if (isNameAv(name)) {
					qry += " where cus_id = ?";
				}
				PreparedStatement prst = con2.prepareStatement(qry);
				
				if (isNameAv(name)) {
					prst.setString(1, name);
				}
						
				ResultSet rset = prst.executeQuery();
				
				while(rset.next()) {
					id = rset.getInt("acc_id");
					name = rset.getString("cus_id");
					customer = rset.getString("name");
					type = rset.getString("Account_type");
					balance = rset.getInt("balance");
					AccountModel a = new AccountModel(id, name, customer, password, type, balance);
					accSingle.add(a);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return accSingle;
	}
		

	// Adding a New User with an account
	public int addUser(AccountModel a) throws SQLException {
		Connection con = DButil.getInstance().getConnection();

		PreparedStatement prst = con.prepareStatement("insert into bankapp.customer_acc (name, cus_id, account_type, balance) values(?,?,?,?)");
						
		if (!accTable.contains(name)) {
			prst.setString(2, a.getCustomer());
			prst.setString(3, a.getName());
			prst.setString(4, a.getType());
			prst.setDouble(5, a.getBalance());

		}	else {
			System.out.println("User Name is already in use. "
					+ "Choose another user name.");
		}
		
		int insert1 = prst.executeUpdate();
		return insert1;
//		PreparedStatement prst = con2.prepareStatement("insert into bankapp.customer_login (user_name, password) value(?,?)");

	}
	
	//Activate account
	public int addActive(AccountModel a) throws SQLException {
		Connection con = DButil.getInstance().getConnection();
		
		PreparedStatement prst = con.prepareStatement("update bankapp.customer_acc set active = 'Y' where name = ?;");
		
		prst.setString(1, name);
		
		int insert = prst.executeUpdate();
		
		return (insert);
	}
	
	public int updateB(AccountModel a) {
		int insert =0;
		try {
			Connection con = DButil.getInstance().getConnection();
			PreparedStatement prst = con.prepareStatement("update bankapp.customer_acc set balance where name = ?;");
			prst.setString(1, name);
			
			insert = prst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Unable to update account balance!");
			e.printStackTrace();
		}
		
		return (insert);
	}
	
	public List<AccountModel> login(String name, String password, String emp){
		List<AccountModel> a = new ArrayList<AccountModel>();
		
		try {
			Connection con1 = DButil.getInstance().getConnection();
			Statement stmt = con1.createStatement();
			
			ResultSet rs1 = stmt.executeQuery("select  * from bankapp.customer_login");
			
			while(rs1.next()) {
				id = rs1.getInt("c_id");
				name = rs1.getString("user_name");
				password = rs1.getString("password");
				emp = rs1.getString("employee");
				AccountModel am = new AccountModel();
				a.add(am);
			}
				
		} catch (SQLException e) {
			System.out.println("Username or password is incorrect.");
			e.printStackTrace();
		}
		return a;
	}

}
