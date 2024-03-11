public class StageEvent extends Event {
    private int noOfShows;
    private double costPerShow;

    public StageEvent(String name, String detail, String type,String organiser,Integer noOfShows,Double costPerShow){
        super(name,detail,type,organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    public Double calculateAmount(){
        return costPerShow* Double.valueOf(noOfShows);
    }
    public void display(){
        System.out.println("Event Name:"+super.getName());
        System.out.println("Detail:"+super.getDetail());
        System.out.println("Type:"+super.getType());
        System.out.println("Organiser Name:"+super.getOrganiser());
        System.out.println("Total Cost:"+calculateAmount());
    }
}
