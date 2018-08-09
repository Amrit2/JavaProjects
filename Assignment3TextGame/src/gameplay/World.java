package gameplay;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is the entry point for the game and processes the user commands.
 * @author Amritpal Kaur, 14865526
 */

public class World 
{
	Scanner userInput = new Scanner(System.in);
	private Player player;
	private Room[] room;
	private PlayMode mode;  					
	private boolean gameInProgress;
	private int currentRoom;

	public enum PlayMode 							//enum for the two different modes of the game
	{
		battle,
		explore;
	}

	public enum ExploreCommands 					// enum for the explore commands 
	{
		door,
		pickup,
		exit,
		describe,
		admire,
		eat,
		mobile,
		stats,
		wield,
		wieldFistsOfFury,
		open,
		help;
	}

	public enum BattleCommands 						// enum for the battle commands
	{
		attack,
		wieldWeapon,
		wieldFistsOfFury,
		help;
	}

	/**
	 * The constructor sets the room the player is in.
	 * @param room: an array of rooms
	 * @param startRoomIndex: is the current room the player is in
	 */
	public World (Room[] rooms, int startRoomIndex) 
	{ 
		this.room = rooms;	
		currentRoom = startRoomIndex;
	}

	/**
	 * The play method introduces the player and the room.
	 * And calls the corresponding command function based on the game mode 
	 * the player the in.
	 * @param player
	 */
	private void play(Player player)
	{
		this.mode = PlayMode.explore;			// setting the initial mode of the game to explore
		this.gameInProgress = true;
		this.player = player;
		
		player.setWeapon(new FistsOfFury("Fists of Fury"));
		System.out.println("Welcome player "+ player.getName() + "\n");

		System.out.println(player.getName() + " is wearing " + player.getDescription()+ "\n"+
				"Health:" + player.getHealthPoints() + " Confidence:" + player.getConfidenceValue() + " Wielding:" + player.getWeapon()
				+ "\n" + room[currentRoom].getDescription());


		while(gameInProgress)
		{
			switch(mode)										// switch the mode of the game
			{
			case explore:
				processExploreUserInput();
				break;
			case battle:
				processBattleUserInput();             
				break;
			}

		}
	}

	/**
	 * The processExplore method handles the commands that the user inputs
	 * in the explore mode and the calling of the function based on the 
	 * user command.
	 */
	
	private void processExploreUserInput() 
	{
		System.out.println("?>");
		String command = userInput.nextLine();
		String[] tokens = command.toLowerCase().split(" ");
		ExploreCommands token = ExploreCommands.valueOf(tokens[0]);			// splitting the user input into an array to store the command

		switch(token) {														// switching the commands
		case door:
			doors(tokens[1]);												// pass in the door number
			break;
		case pickup:
			pickup(tokens[1]);
			break;
		case exit:
			exit();
			break;
		case describe:
			describe();
			break;
		case admire:
			admireValuable(tokens[1]);
			break;
		case eat:
			eatFood(tokens[1]);
			break;
		case mobile:
			mobile(tokens[2]);
			break;
		case stats:
			stats();
			break;
		case wield: 
			wieldWeapon(tokens[1]);
			break;
		case wieldFistsOfFury:
			wieldFistsOfFury();
			break;
		case open:
			openChest(tokens[1]);
			break;
		case help:
			help();
			break;
		default:
			System.out.println("Invalid Command");
		}

	}
	
	/**
	 * The processBattle method handles the commands that the user inputs
	 * in the battle mode and the calling of the function based on the 
	 * user command.
	 */

	private void processBattleUserInput() 
	{
		System.out.println("?>");
		String command = userInput.nextLine();
		String[] tokens = command.toLowerCase().split(" ");
		BattleCommands token = BattleCommands.valueOf(tokens[0]);

		switch(token) {
		case attack:
			attack();
			break;
		case wieldWeapon:
			wieldWeapon(tokens[1]);
			break;
		case wieldFistsOfFury:
			wieldFistsOfFury();
			break;
		case help:
			help();
			break;
		}
	}

	/**
	 * Handles the functionality when the player enters the room
	 */
	private void onEnterRoom() 
	{
		if (room[currentRoom].getMonster() != null) {						
			Monster aMonster = room[currentRoom].getMonster();					
			if (aMonster.appear()) {											// check if the monster will appear
				this.mode = PlayMode.battle;									// changing the game mode to battle if the monster does appear
				System.out.println("A " +  aMonster.getDescription() + " draws hither!");
				System.out.println(player.getName() + " wields " + player.getWeapon() + " and is ready for battle!" );
			}
		}
	}

	/**
	 * describes the room, the pickups in the room and the number of doors
	 */
	private void describe() 
	{
		System.out.println(room[currentRoom].getDescription() +"\n" + "There is " + room[currentRoom].getPickupsInRoom() + " on the floor. \nThere is " +  room[currentRoom].doors()+ " doors");
	}

	/**
	 * Process the attack command input by the player
	 */
	private void attack() 
	{
		if ( room[currentRoom].getMonster() != null) 						// check if there is definitely a monster in the room
		{
			// print out the damage done to the monster by the player
			System.out.println(player.getName() + " attacks slow moving " + room[currentRoom].getMonster() 
					+ "\n" +"The slow moving " + room[currentRoom].getMonster() + " sustains " 
					+ room[currentRoom].getMonster().defendAttack(player) + " damage" + "\n"); 
			
			//if the monster's health is above 0 only then it will attack the player
			if (room[currentRoom].getMonster().getHealthPoints() > 0) 
			{
				// print out the damage done to the player by the monster
				System.out.println("The " + room[currentRoom].getMonster() + " attacks." + "\n" +
									player.getName() + " has sustained " + 
									player.defendAttack(room[currentRoom].getMonster()) + " damage." + "\n");
			}
			else 
			{
				// if the monster's health is 0 or below, print the message of player winning
				System.out.println("Brave " + player.getName() + " has defeated the slow moving " + 
									room[currentRoom].getMonster());
				this.mode = PlayMode.explore;  							// change the mode to explore if the player wins
				processExploreUserInput();
			}
			
			// if the player's health is less than 0 set it to 0
			if (player.getHealthPoints() <= 0) 
			{
				player.setHealthPoints(0);
				System.out.println("Alas! " + player.getName()+ " has been defeated! \nYou have failed your quest");
				gameInProgress = false;							// if the player loses end the game
			}

			System.out.println(player.getName() + " is wearing " + player.getDescription() + "\n" + 
					"Health:" + player.getHealthPoints() + " Confidence:" + player.getConfidenceValue()+ " Wielding:" + player.getWeapon());
			
		}
	}

	/**
	 * Process the help command
	 * Check the mode of the game and display the corresponding command to that mode
	 */
	private void help() 
	{
		if (mode == PlayMode.battle) 		
		{
			System.out.println("Battle Commands: " + Arrays.asList(BattleCommands.values()));
		}
		else
			System.out.println(Arrays.asList(ExploreCommands.values()));
	}

	/**
	 * The method process the contents of the chest in that current room
	 * @param valuable: the valuable picked up
	 */
	private void openChest(String valuable) 
	{
		Pickup pickup = player.getPlayerInventory().select(valuable);			// find the valuable in the inventory
		if (pickup instanceof Openable) 										// check each valuable in the inventory to see if any is of type Openable
		{
			Openable chest = (Openable) pickup;									// typecast the pickup as Openable
			if (chest.isLocked()) 												// check if the chest is locked
			{
				boolean hasOpener = false;									
				Inventory playerInv = player.getPlayerInventory();				// get the player's inventory
				for (Pickup opener: playerInv.getItems()) 						// for each item in the inventory 
				{
					if (opener instanceof Opener) 							// check if it is of type Opener, such as a key or lockpick
					{
						hasOpener = true;									// if so, set hasOpener to true
					}
				}
				chest.setLocked(false);										// open the chest
				player.getPlayerInventory().add(chest.getContents());		// add the contents of the chest to player's inventory
				System.out.println(player.getName()+ " has opened the " + chest + " taking " + chest.getContents());
				player.getPlayerInventory().remove(chest);					// remove the chest from the inventory
			}

		}		
	}

	/**
	 * if the player wields Fists of Fury, change the mode to battle
	 */
	private void wieldFistsOfFury() 
	{
		this.mode = PlayMode.battle;
	}

	/**
	 * The wield weapon method, wields the weapon for the player 
	 * @param weapon: the player's chosen weapon
	 */
	private void wieldWeapon(String weapon) 
	{
		if (player.getPlayerInventory().getItems().toString().equalsIgnoreCase(weapon));
		{	
			// printing out messages based on if there is a monster in the room.
			if (room[currentRoom].getMonster() != null) 			
			{
				System.out.println("Brave " + player.getName() + " wields a " + weapon + " is ready for battle.");
			}
			else
				System.out.println("Brave " + player.getName() + " wields a " + weapon);
		}
	}

	/**
	 * The stats prints the player's name, room description, player's health points, confidence points,
	 * wielding weapon and player's inventory
	 */
	private void stats() {
		System.out.println(player.getName() + " is wearing " + player.getDescription()  
		+ "\n" + "Health:"+ player.getHealthPoints() + " Confidence:" + player.getConfidenceValue() + " Wielding:" + player.getWeapon() + "\n" 
		+ "Brave "+ player.getName() + " is carrying the following items: " + player.getPlayerInventory().toString());
	}

	/**
	 * The mobile method gets the latest tweet of the provided user
	 * @param userName: the twitter username supplied by the player
	 */
	private void mobile(String userName) 
	{
		Pickup pickup = player.getPlayerInventory().select("mobile");		//get the mobile from the inventory
		if (pickup instanceof Mobile) 										// check if it an instance of Mobile
		{
			Mobile mobile = (Mobile)pickup;	
			System.out.println(mobile.showLatestTweetFrom(userName));		// get the tweet
		}
		else 
			System.out.println("No mobile avaliable.");
	}

	/**
	 * Handles the eating of the food: removing the chosen food from inventory and 
	 * increasing the player's health points.
	 * @param food: the food player's wants to eat
	 */
	private void eatFood(String food) 
	{
		Pickup pickup = player.getPlayerInventory().select(food);
		if (pickup instanceof Food) 
		{
			Food currentFood = (Food) pickup;
			player.getPlayerInventory().remove(currentFood);							// remove the food from the inventory
			player.setHealthPoints(player.getHealthPoints() + currentFood.getIncreaseInHealthPoints());		// increase the health points 
			System.out.println("Brave " + player.getName() + " ate the " + currentFood + " increasing his health by " + currentFood.getIncreaseInHealthPoints());
		}
		else
			System.out.println("Brave " + player.getName() + " could not find " + food + " in his inventory.");
	}


	/**
	 * The method admires the chosen valuable input by the player
	 * @param item: the chosen valuable to be admired
	 */
	private void admireValuable(String item) 
	{
		Pickup pickup = player.getPlayerInventory().select(item);
		if (pickup instanceof Valuables) {
			Valuables valuable = (Valuables)pickup;
			if (!valuable.isConsumed()) 
			{
				player.admire(valuable);						// if the value is not consumed already, admire the valuable
				System.out.println(player.getName() + valuable.outputMessage());
				System.out.println(player.getName() + " confidence increases by " + valuable.getIncreaseInHealth());
			}
		}
	}

	/**
	 * ends the game by setting the game in progress variable to false
	 */
	private void exit() {
		this.gameInProgress = false;
		System.out.println(player.getName() + " searched everywhere for the exit....\n" + 
							"     ...and behold, found it.\n" + 
							"Well done brave "+ player.getName() + ".\n" + 
							"Your quest has now ended.");
	}

	/**
	 * Adds the chosen item to the player's inventory and removes from the room's inventory
	 * @param item: item to be added to be picked up
	 */
	private void pickup(String item) {
		Pickup pickup = room[currentRoom].getPickupsInRoom().select(item);
		if (pickup instanceof Pickup) 
		{
			Pickup pickupItem = (Pickup) pickup;
			room[currentRoom].getPickupsInRoom().remove(pickupItem);		// removing from room's inventory
			player.getPlayerInventory().add(pickupItem);					// adds it to the player's inventory
			System.out.println(player.getName() + " picks up " + item);
		}
	}

	/**
	 * Changes the current room the player is in based on the chosen door
	 * @param doorNumber: the door chosen by the player
	 */
	private void doors(String doorNumber) 
	{
		int doorNum = Integer.parseInt(doorNumber);				// change the door number to an int from String
		if (doorNum > 0 && doorNum < room.length ) 				// ensures the door number is valid
		{
			Room wantedRoom = room[doorNum];
			boolean valid = false;
			for (Room aRoom : room[currentRoom].getConnectingRooms()) 
			{
				if (aRoom == wantedRoom) valid = true;			// ensures the door to the room is a connecting room
			}
			currentRoom = doorNum;								// set the current room to the player's chosen room
			System.out.println(player.getName() +  " bravely open door " + doorNumber + "\n" + room[currentRoom].getDescription());
			this.onEnterRoom();									// process the on enter room method as the current room the player is in has changed
		}
	}

	public static void main(String[] args) 
	{
		World world = ReadWorldDataFile.simpleWorld();
		Player playerOne = new Player("Sir Kendric","Shiny Armour",100,50);
		world.play(playerOne);
	}
}
