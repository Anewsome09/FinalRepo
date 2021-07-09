package fixtures;

public class Room extends Fixture {
	/*
	 * exits is a list of the 'adjacent' rooms...Here it is established
	 * that all rooms will have an array that can hold 4 references.
	 * Note that this number is arbitrary, and that is specifically is
	 * used to associate the cardinal directions. There are other ways
	 * to implement this logic...
	 */
	
	
	private Room[] exits = new Room[4];

	
	public Room getNorthExit() {
		return exits[0];
	}
	public Room getEastExit() {
		return exits[1];
	}
	public Room getSouthExit() {
		return exits[2];
	}
	public Room getWestExit() {
		return exits[3];
	}
	public void setNorthExit(Room exit) {
		exits[0] = exit;
	}
	public void setEastExit(Room exit) {
		exits[1] = exit;
	}
	public void setSouthExit(Room exit) {
		exits[2] = exit;
	}
	public void setWestExit(Room exit) {
		exits[3] = exit;
	}
	
	
	
	/*
	 * This Fixture array is a collection of the items we can potentially
	 * have in our room.
	 */
	private Fixture[] items;

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public Room[] getExits() {
		
		return this.exits;
	}
	
	/*
	 * This method can be used to obtain a specific Exit from
	 * the Room Object...
	 * 
	 * This method is used in the example to provide the arbitrary
	 * way to move north/south/east/west
	 */
	public Room getExit(String direction) {
		int index = -1;
		
		direction = direction.toUpperCase();
		switch (direction) {
			case "NORTH":
				index = 0;
				break;
			case "SOUTH":
				index = 1;
				break;
			case "WEST":
				index = 2;
				break;
			case "EAST":
				index = 3;
				break;
		}
		
		return this.exits[index];

	}
	
	// setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	// Overloaded setter method. Allows us to set single exit based on index...
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	// Getter and Setter for Fixtures
	public Fixture[] getItems() {
		return items;
	}
	
	/*
	 * The setter method here uses VarArgs simply for ease of use
	 */
	public void setItems(Fixture... items) {
		this.items = items;
	}
}
