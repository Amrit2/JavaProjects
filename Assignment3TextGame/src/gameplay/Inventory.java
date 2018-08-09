package gameplay;
import java.util.ArrayList;
/**
 * Creating an inventory to store the player's pickup items throughout the game
 * @author Amritpal Kaur, 14865526
 *
 */
public class Inventory 
{
	private ArrayList<Pickup> items;					// creating a dynamic array called items

	/**
	 * The constructor instantiates the an array list of type Pickup
	 */
	public Inventory()
	{
		this.items = new ArrayList<Pickup>();			
	}
	
	/**
	 * returns all the items in the inventory as a String
	 */
	public String toString()	
	{	
		String out = "";		
		for(Pickup p : items)
		{
			if(p!=null)
			{
				out+= p+",";
			}
		}
		if(out.isEmpty()) out = "nothing";
		return out;
	}
	
	/**
	 * Finds the passed in id in the inventory before returning it
	 * @param id: the pickup id of type String
	 * @return the Pickup item removed from the inventory
	 */
	public Pickup remove(String id)  
	{
		Pickup p = this.select(id);

		this.items.remove(p);			

		return p;
	}
	
	/**
	 * Looks for a certain item and returns it if it exits in the inventory
	 * @param id: the Pickup id of type String
	 * @return a Pickup item
	 */
	public Pickup select(String id)
	{
		for(Pickup p : this.items)
		{
			if (p!=null && p.compareID(id))
			{
				return p;
			}
		}
		return null;
	}
	
	/**
	 * Adds the Pickup item to the inventory
	 * @param p: item of type Pickup
	 */
	public void add(Pickup p)
	{
		this.items.add(p);
	}
	
	/**
	 * Removes the pickup item from Inventory
	 * @param p: item of type Pickup
	 */
	public void remove(Pickup p)
	{
		this.items.remove(p);
	}
	
	/**
	 * Gives the items in the inventory
	 * @return an array of items from the inventory
	 */
	public Pickup[] getItems()
	{
		Pickup[] items = new Pickup[this.items.size()]; 	// instantiates an array of items of the size items
		for(int i=0;i<items.length;i++)
		{
			items[i] = this.items.get(i);					// store all the items in the array before returning it
		}
		return items;
	}
}