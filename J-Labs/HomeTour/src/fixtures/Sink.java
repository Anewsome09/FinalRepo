package fixtures;

public class Sink extends Fixture implements UseObj {
	
	public Sink(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
	}

	@Override
	public void use() {
		System.out.println("Your hands have been washed");
		
	}

}
