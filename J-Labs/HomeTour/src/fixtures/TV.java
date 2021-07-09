package fixtures;

public class TV extends Fixture implements UseObj {

	public TV(String name, String shortDesc, String longDesc) {
		super("tv", "Living Room TV","60in FlatScreen HD TV");
	}

	@Override
	public void use() {
		System.out.println("'The Office' is playing.");
		
	}
}
