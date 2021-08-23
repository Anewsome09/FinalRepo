package common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="purchase")
public class Purchase implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "purchase_ticket_id_seq", allocationSize = 1)
	
	@Column(name="ticket_id")
	private int id;
	@Column
	private String purchase;
	@Column
	private int balance;
	
	@Column
	private String username;
	
	public Purchase() {
		super();
	}
	
	public Purchase(String purchase, String username, int balance) {
		super();
		this.username = username;
		this.purchase = purchase;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPurchase() {
		return purchase;
	}

	public void setTitle(String purchase) {
		this.purchase = purchase;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}
