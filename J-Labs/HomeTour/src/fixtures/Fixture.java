package fixtures;

public abstract class Fixture extends Exit{
	
	protected String name;
	protected String shortDesc;
	protected String longDesc;
	
	// Parameterized Constructor
	public Fixture(String name, String shortDesc, String longDesc) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	// Overridden toString method
	public String toString() {
		return "Fixture [Fixture = " + name + ", \nShort Description = " + shortDesc + ",\n Full Description=" + longDesc + "]";
	}
	
	
}
