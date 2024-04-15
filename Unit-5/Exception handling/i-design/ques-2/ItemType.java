public class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType(String name, Double deposit, Double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
    @Override
    public String toString(){
        return "Name:"+name+"\nDeposit:"+deposit+"\nCost Per Day:"+costPerDay;
    }
}
