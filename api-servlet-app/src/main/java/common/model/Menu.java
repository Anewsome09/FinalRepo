package common.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="shop")
public class Menu implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "purchase_id_seq", allocationSize = 1)
	private int id;

	@Column
	private String title;
	
	@Column(name="date")
	private Date beginDate;
	
	@Column(name="username")
	private String username;
	
	@Column(name="balance")
	private int balance;

	public Menu() {
		super();
	}

	public Menu(String title, Date beginDate, String name, int balance) {
		super();
		this.title = title;
		this.beginDate = beginDate;
		this.username = name;
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	@Override
	public String toString() {
		return "["+username+" bought " + this.title + "," + this.beginDate +" for "+balance+"]";
	}
}
