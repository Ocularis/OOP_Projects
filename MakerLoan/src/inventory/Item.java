package inventory;

import java.util.ArrayList;

public class Item {
	private String name; 
	private int itemID;
	
	private static ArrayList<Item> items = new ArrayList<>();
	
	public Item(String name, int itemID) {
		this.name = name; 
		this.itemID = itemID; 
		
		items.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	public static ArrayList<Item> getItems() {
		return items;
	}
}
