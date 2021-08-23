package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.Menu;
import common.model.Purchase;
import common.util.DBUtil;


public class PurchaseImpl implements PurchaseDao {

	@Override
	public void create(Purchase p) {
		Session session = DBUtil.getInstance().getSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;// new RuntimeException(e.getCause());
		}

		session.close();
	}
	
	@Override
	public Purchase getPurchase(String purchase, String username, int balance) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Purchase where username = :uName");
		query.setString("uName", username);
		
		Purchase p = (Purchase) query.uniqueResult();

		session.close();
		return p;
	}

//	public static void main(String[] args) {
//		PurchaseImpl pur = new PurchaseImpl();
		//pur.create(new Purchase("Travel","Antwan", 300));
//		Purchase p = pur.getPurchase( "Travel","Antwan", 300);
//		System.out.println(p);
//	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Purchase> findAll() {

		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Purchase");

		List<Purchase> ps = query.list();

		session.close();

		return ps;
	}

	@Override
	public Purchase findByUser(String username) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Purchase username = :uName");
		query.setString("uName", username);
		
		Purchase ps = (Purchase) query.uniqueResult();

		session.close();

		return ps;
	}
	
	@Override
	public Purchase findById(int id) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.Purchase where ticket_id = :id");
		query.setInteger("id", id);
		
		Purchase ticket = (Purchase) query.uniqueResult();

		session.close();

		return ticket;
	}

//	@Override
//	public void delete(int id) {
//		Session session = DBUtil.getInstance().getSession();
//
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			session.delete(session.get(Purchase.class, new Integer(id)));
//			tx.commit();
//		} catch (HibernateException e) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			throw e;// new RuntimeException(e.getCause());
//		}
//
//		session.close();
//	}

}