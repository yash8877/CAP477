public class SilverStall {
    protected String name;
    protected String detail;
    protected String owner;
    protected int cost;
    public SilverStall(){}
    public SilverStall(String name, String detail, String owner, int cost){
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDetail(String detail){
        this.detail = detail;
    }
    public String getDetail(){
        return detail;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    public int getCost(){
        return cost;
    }

    public int CalculateTotalcost(){
        return cost;
    }

    public void display(){
        System.out.println("Stall Name:"+getName());
        System.out.println("Details:"+getDetail());
        System.out.println("Owner Name:"+getOwner());
    }
}
