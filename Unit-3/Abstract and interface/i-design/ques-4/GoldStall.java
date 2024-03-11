public class GoldStall implements Stall {
    private String stallName;
    private String ownerName;
    private int cost;
    private int tvSet;
    GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet){
        this.stallName = stallName;
        this.cost=cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }
    public void display(){
        System.out.println("Stall Name:" + stallName);
        System.out.println("Cost:" + cost+".Rs");
        System.out.println("Owner Name:" + ownerName);
        System.out.println("Number of TV sets:" +tvSet);
    }
}
