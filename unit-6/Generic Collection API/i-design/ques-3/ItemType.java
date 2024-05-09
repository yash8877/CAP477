public class ItemType {
	//write your code here
	private String name;
	private Double deposit;
	private Double costPerDay;

	public ItemType(String name, Double deposit, Double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20s", this.name, Double.toString(deposit), Double.toString(costPerDay));
	}
}