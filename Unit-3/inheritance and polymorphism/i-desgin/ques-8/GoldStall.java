public class GoldStall extends SilverStall{
    private int tvSet;
    public GoldStall(){}

    public GoldStall(String name, String detail, String owner, int cost,int tvSet){
        super(name, detail, owner, cost);
        this.tvSet = tvSet;
    }
    
    public void setTV(int tvSet){
        this.tvSet = tvSet;
    }
    public int getTv(){
        return tvSet;
    }
    public void show(){
        super.display();
    }
    @Override
    public int CalculateTotalcost(){
        return super.CalculateTotalcost() + (tvSet * 100);
    }

}
