public class PlatinumStall extends GoldStall {
    private int projector;
    public PlatinumStall(){}
    public PlatinumStall(String name, String detail, String owner, int cost, int tvSet, int projector){
        super(name, detail, owner, cost, tvSet);
        this.projector = projector;
    }
    public void setProjector(int projector){
        this.projector = projector;
    }
    public int getProjector(){
        return projector;
    }
    public void info(){
        super.show();
        System.out.println("TV Sets:"+super.getTv());
        System.out.println("Projectors:"+getProjector());

    }
    @Override
    public int CalculateTotalcost(){
        return super.CalculateTotalcost()+(projector * 500);
    }
}
