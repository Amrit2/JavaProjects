package gameplay;
/**
 * The room class instantiate an inventory to store the pickups in the room, lists connecting rooms,
 *store the monster in the room
 * @author Amritpal Kaur, 14865526
 *
 */
public class Room extends Entity {
	private Monster monster;
	private Inventory pickupsInRoom;
	private Room[] connectingRooms;
	private boolean finalRoom; 						

	/**
	 * The constructor sets the description and intialises the instances to null/false
	 * @param description of the room
	 */
	public Room(String description) {
		super(description);
		this.monster = null;
		this.pickupsInRoom = null;
		this.connectingRooms = null;
		this.finalRoom = false;
	}

	/**
	 * The constructor sets the description, pickups and connecting rooms
	 * @param description
	 * @param pickupsInRoom
	 * @param connectingRooms
	 */
	public Room(String description, Inventory pickupsInRoom, Room[] connectingRooms) {
		super(description);
		this.pickupsInRoom = pickupsInRoom;
		this.connectingRooms = connectingRooms;
	}

	/*
	 * get/set the monsters
	 */
	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	/**
	 * get/set inventory of the room
	 * @return picksups from the rooms
	 */
	public Inventory getPickupsInRoom() {
		return pickupsInRoom;
	}

	public void setPickupsInRoom(Inventory pickupsInRoom) {
		this.pickupsInRoom = pickupsInRoom;
	}

	/**
	 * get/set pickups
	 * @return an array of connecting rooms
	 */
	public Room[] getConnectingRooms() {
		return connectingRooms;
	}

	public void setConnectingRooms (Room[] connecting) {
		this.connectingRooms = connecting;
	}
	
	/**
	 * returns the number of doors
	 * @return
	 */
	public int doors() {
		return connectingRooms.length;
	}

	/**
	 * checks if a room is final
	 * @return a boolean
	 */
	public boolean isFinalRoom() {
		return finalRoom;
	}

	public void setFinalRoom(boolean finalRoom) {
		this.finalRoom = finalRoom;
	}
}

