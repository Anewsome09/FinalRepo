package manager;

import java.util.List;

import common.model.Purchase;
import dao.PurchaseDao;
import dao.PurchaseImpl;

public class PurchaseManager {

	private PurchaseDao dao = new PurchaseImpl();
	
	public PurchaseManager() {
	}
	
	public void create(Purchase p) {
		dao.create(p);
	}
	
	public List<Purchase> findAll() {
		return dao.findAll();
	}

	public static void main(String[] args) {
		Purchase pl = new PurchaseManager().findById(0);
		System.out.println(pl);
	}

	public Purchase findByUser(String username) {
		return dao.findByUser(username);
	}

	public Purchase findById(int id) {
		return dao.findById(id);
	}
//	public void delete(int id) {
//		dao.delete(id);
//	}
}
