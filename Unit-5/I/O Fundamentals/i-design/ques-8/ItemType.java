public class ItemType {
	//fill your code here
	private String itemTypeName;
	private Double cost;

	public ItemType(String itemTypeName, Double cost) {
		this.itemTypeName = itemTypeName;
		this.cost = cost;
	}

	public String getName() {
		return this.itemTypeName;
	}

	public Double getCost() {
		return this.cost;
	}
}
