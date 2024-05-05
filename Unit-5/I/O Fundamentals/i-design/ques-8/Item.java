public class Item {
	//fill your code here
	private Integer itemNumber;
	private String vendor;
	private ItemType itemType;

	public Item(Integer itemNumber, String vendor,ItemType itemType) {
		this.itemNumber = itemNumber;
		this.vendor = vendor;
		this.itemType = itemType;
	}

	public Integer getItemNumber() {
		return this.itemNumber;
	}

	public String getVendor() {
		return this.vendor;
	}

	public String getItemTypeName() {
		return this.itemType.getName();
	}

	public Double getItemCost() {
		return this.itemType.getCost();
	}
}