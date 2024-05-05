public class Item {
	//write your code here	
	private String number;
	private ItemType itemType;
	private String vendor;

	public Item(String number, ItemType itemType, String vendor) {
		this.number = number;
		this.itemType = itemType;
		this.vendor = vendor;
	}

	public String getName() {
		return this.itemType.getName();
	}
}