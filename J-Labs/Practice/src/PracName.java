
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracName {
	
	private String name;
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		
		Iterator<String> item = fruits.iterator();
		while(item.hasNext()) {
			String fruit = item.next();
			System.out.println(fruit);
			
			
			
		}
		
		
	}

}
