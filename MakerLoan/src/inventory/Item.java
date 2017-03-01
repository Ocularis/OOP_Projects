package inventory;

public class Item {
	private String name; 
	private int itemID;
	private int amount; 
	
	public Item(String name, int itemID, int amount) {
		this.name = name; 
		this.itemID = itemID; 
		this.amount = amount; 
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
