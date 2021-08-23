package dao;

import java.util.List;

import common.model.Purchase;

public interface PurchaseDao {
	
	public void create(Purchase p);
	
	public Purchase getPurchase(String purchase, String username, int balance);

	public List<Purchase> findAll();
	
	public Purchase findById(int id);

	public Purchase findByUser(String username);
}
