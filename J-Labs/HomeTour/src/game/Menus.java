package game;

import fixtures.*;
import game.Player;

public class Menus {
	
	
	

	/*
	 * This method prints information to the console regarding the 
	 * player's current location...
	 */
	
	public static void printRoom(Player player) {
		System.out.println(":::: CURRENT ROOM ::::");
		System.out.println("Name: " + player.getCurrentRoom().getName());
		System.out.println("Short Desc: " + player.getCurrentRoom().getShortDesc());
		System.out.println("Long Desc: " + player.getCurrentRoom().getLongDesc());
		Menus.printRoomExits(player);
		Menus.printInteractableObjects(player.getCurrentRoom());
	}
	
	/*
	 * Method used to print Instructions for how to play the game
	 */
	public static void printInstructions() {
		System.out.println("Let's begin Anthoney's Home Tour!!! "
				+ "Using the Directions: north, south, east and west "
				+ "\n You will be able to enter each room."
				+ "\neach room has an object that you can interact with "
				+ "\nusing the 'use' command");
	}
	
	/*
	 * This method is used to print a list of all exits connected to
	 * a Room. This method is based on the arbitrary way that the 
	 * connections to rooms are established. In the case of the example
	 * the Room class has a 'getExit' method which can be used to 
	 * arbitrarily determine a string associated with an exit (i.e.
	 * North/South/East/West), and we print this information using
	 * this method
	 */
	
	
	
	public static void printRoomExits(Player player) {
		// TODO: Implement Method
		
		System.out.println();
	}

	/*
	 * This method is used to Print a list of the Objects in a room
	 * using the list of 'items' (Fixture[]). Specifically, this 
	 * method searches through all Fixture objects of the items in
	 * a Room, and if the Fixture Object is an instanceof (binary operator)
	 * the Interactable interface, we print it out.
	 */
	public static void printInteractableObjects(Room room) {
		// TODO: Implement Method
		System.out.println(room.getItems());
	}
}
