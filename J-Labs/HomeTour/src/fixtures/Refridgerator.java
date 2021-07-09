package fixtures;

public class Refridgerator extends Fixture implements UseObj {
	
	// Parameterized Constructor
	public Refridgerator(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("The Fridge is full of delicious food!");
		
	}
}
