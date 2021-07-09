package one;
import two.ProtectedSubClass;

public class AccessModifiers {
	
	public static void main(String[] args) {
		Person alex = new Person();
		alex.age = 27;
		
		System.out.println(alex.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
        psc.printID();
	}
    
}


