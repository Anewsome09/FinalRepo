package manager;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	//Week 6 Day 2
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserManager mgr = (UserManager) context.getBean("userMgr");
		boolean success = mgr.login(null,null);
		System.out.println(success);
	}

}
