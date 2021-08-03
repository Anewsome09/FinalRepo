import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Practice1{
	
	public String str;
	public Integer i;
	
	public static void main(String[] args) {
	      HashMap<String, Integer> group = new HashMap<>();

	      Group g1 = new Group();
	      
//      group.put("A1", 100);
//      group.put("B1", 89);
//      group.put("C1", 79);
//      group.put("D1", 84);

      // Traversing through the map
      for (Map.Entry<String, Integer> gp : group.entrySet()) {
          System.out.print(gp.getKey() + ":");
          System.out.println(gp.getValue());
      }
      
      
	}
}

class Group {
	private Group group;
	public double score;
	List<Member> members = new ArrayList<Member>();
}

class Member {
	private String name; 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
//	public Map<Member, Double> getScores() {
//		return score(
//	}
//	public void setScores
}

