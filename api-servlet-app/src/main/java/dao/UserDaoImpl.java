package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.model.User;
import common.util.DBUtil;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
	}

	@Override
	public void create(User user) {
		Session session = DBUtil.getInstance().getSession();

		Transaction tr = null;
		try {
			tr = session.beginTransaction();
			session.save(user);
			tr.commit();
		} catch (HibernateException e) {
			if (tr != null) {
				tr.rollback();
			}
			throw e;// new RuntimeException(e.getCause());
		}

		session.close();
	}

	@Override
	public User getUser(String username, String password) {
		Session session = DBUtil.getInstance().getSession();

		Query query = session.createQuery("FROM common.model.User where username = :uname and password = :pswd");
		query.setString("uname", username);
		query.setString("pswd", password);

		User user = (User) query.uniqueResult();

		session.close();
		return user;
	}
	
	public static void main(String[] args) {
		UserDaoImpl impl = new UserDaoImpl();
		//impl.create(new User("Antwan","ace23"));
		//impl.getUser("Tony", "tone1");
		User obj = impl.getUser("Tony", "tone1");
		System.out.println(obj);
	}

}
