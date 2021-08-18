package manager;

public class UserManagerImpl implements UserManager {
	
	private String role;
//	private User user;
	
	public UserManagerImpl() {}
	
	
	public UserManagerImpl(String role) {
		this.role = role;
	}
	
	public boolean login(String username, String password) {
		System.out.println("role in manager: "+this.role);
		return false;
	}
	
	public String getRole() {
		return this.role;
	}
	
//	public void setUser(User user) {
//		this.user = user;
//	}

}
