package game;

import fixtures.*;


/*
 * The RoomManager class is used to create all of the Rooms in
 * the house, establish the exits, create the Room Objects, and
 * add those objects to the rooms.
 * 
 * This class contains the most lines of code, due to the number
 * of objects being created by this class
 */
public class RoomManager {
	private Room startingRoom;
	
	private Room[] rooms;
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	public void init() {
		/*
		 * The init method is called one time at the start
		 * of our program execution to create all rooms, 
		 * set exits, create other objects, and set object
		 * lists for those rooms...
		 */
		
		// 1 - Create all Rooms
		Room fr = new Room(
	    		"The Foyer",
	    		"The entry way leading into the home",
	    		"A living room is open to the west, with a mounted TV is diplayed./n"
	    		+ "To the north is Grand stairway to the Master Bedroom. The Kitchen to the east./n");
	    this.rooms[0] = fr;
		// create more rooms here...
		Room lv = new Room(
				"Living Room",
				"A large living room with a relaxing vibe",
				"This living room has a 60in TV mounted over a fireplace. To the north appears to "
				+ "be the main bathroom");
		this.rooms[1] = lv;
		
		Room kt = new Room(
	    		   "The Kitchen",
	    		   "A recently upgraded kitchen",
	    		   "The Kitchen has marble topped counters with a fancy Stainless steel fridge, which "
	    		   + " appears to be well stocked. The guest bathroom is to the North");
	    this.rooms[2] = kt;
		
		Room bt = new Room(
				"Bathroom",
				"The place to take care of business.",
				"This bathroom has all the necessities with a ready to use sink, "
				+ "the bathroom has two exits, the kitchen is east and living room is west");
		this.rooms[3] = bt;
		
		Room bd = new Room(
				"Master Bedroom",
				"Large Master Bedroom to relax",
				"A King sized bed sits in the middle of this room, there is/n"
				+ " the Master bathroom to the east");
		this.rooms[4] = bd;
		
		Room mbt = new Room(
				"Master Bathroom",
				"The bathroom for Royalty",
				"This large bathroom resembles a spa, with a jacuzzi bathtub and updated/n"
				+ "counters. Only the Master Bedroom has access here");
		this.rooms[5] = mbt;

		Room[] frExits = {lv, kt, bd};
		fr.setExits(frExits);
		// set other room exits here...
		Room[] btExits = {kt, lv};
		bd.setExits(btExits);
		
		Room[] lvExits = {bt, fr};
		lv.setExits(lvExits);
		
		Room[] ktExits = {bt, fr};
		kt.setExits(ktExits);
		
		Room[] bdExits = {mbt,fr};
		mbt.setExits(bdExits);
		
		Room[] mbtExits = {bd,fr};
		mbt.setExits(mbtExits);
		
		fr.setEastExit(kt);
		fr.setNorthExit(bd);
		fr.setWestExit(lv);
		
		kt.setWestExit(fr);
		kt.setNorthExit(bt);
		
		lv.setEastExit(fr);
		lv.setNorthExit(bt);
		
		bd.setSouthExit(fr);
		bd.setEastExit(mbt);
		
		mbt.setWestExit(bd);
		
		
		
		// 3 - Create Objects 
		Refridgerator refridgerator = new Refridgerator("Fridge", "A Stainless Steel Fridge", "This Fridge is provides an exterior Display which shows/n"
				+ "the contents of the fridge and freezer, which appear to /n"
				+ "to be full.");
		// create other objects here...
		Sink sk = new Sink("Sink","Marble Counter Sink"," This lavish sink has the finest hand soap and lotion/n"
				+ "to prevent Corona and moisterize your hands");
		
		TV tv = new TV("tv", "Living Room TV","60in FlatScreen HD TV which is currently off.");
		
		Bed bed = new Bed("Bed", "King Bed Set", "California King sized Tempur Pedic mattress." );
		
		/*
		 * 4 - Set item list for Rooms (note, we used a 
		 * VarArgs for the setItems method in the Room Class
		 */
		kt.setItems(refridgerator);
		kt.setItems(sk);
		// set other room objects here...
		kt.setItems(sk);
		lv.setItems(tv);
		bd.setItems(bed);
		mbt.setItems(sk);
		
		
		// 5 - Set Starting Room
		this.startingRoom = fr;
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	
}
