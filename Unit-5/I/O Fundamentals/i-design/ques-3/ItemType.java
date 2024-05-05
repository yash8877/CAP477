public class ItemType {
    //Your code here
	private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType(String name, String deposit, String costPerDay) {
        this.name = name;
        this.deposit = Double.parseDouble(deposit);
        this.costPerDay = Double.parseDouble(costPerDay);
    }

    public String getName() {
        return this.name;
    }

    public Double getDeposit() {
        return this.deposit;
    }

    public Double getCostPerDay() {
        return this.costPerDay;
    }
}