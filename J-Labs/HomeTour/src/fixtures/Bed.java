package fixtures;

public class Bed  extends Fixture implements UseObj{
	
	public Bed(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void use() {
		System.out.println("As you sink into the mattress....A Few Hours Later");
		
	}


}
