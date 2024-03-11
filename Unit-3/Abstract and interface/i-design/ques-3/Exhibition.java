public class Exhibition extends Event{
    private int noOfStalls;
    private double rentPerStall;

    public Exhibition(String name, String detail, String type,String organiser,Integer noOfStalls,Double rentPerStall){
        super(name,detail,type,organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }
    
    public Double calculateAmount(){
        return Double.valueOf(noOfStalls) * rentPerStall;
    }

    public void display(){
        System.out.println("Event Name:"+super.getName());
        System.out.println("Detail:"+super.getDetail());
        System.out.println("Type:"+super.getType());
        System.out.println("Organiser Name:"+super.getOrganiser());
        System.out.println("Total Cost:"+calculateAmount());
    }
}
