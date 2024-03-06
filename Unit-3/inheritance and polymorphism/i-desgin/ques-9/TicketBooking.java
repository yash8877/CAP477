public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }
    
    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void display(){
        System.out.println("Stage event:"+getStageEvent());
        System.out.println("Customer:"+getCustomer());
        System.out.println("Number of seats:"+getNoOfSeats());
    }

    public void makePayment(double amount){
        display();
        System.out.println("Amount "+amount+" paid in cash");
    }

    public void makePayment(String walletNumber,double amount){
        display();
        System.out.println("Amount "+amount+" paid using wallet number "+walletNumber);
    }

    public void makePayment(String creditCard,String ccv,String name,double amount){
        display();
        System.out.println("Holder name:"+name);
        System.out.println("Amount "+amount+" paid using "+creditCard+" card\nCCV:"+ccv);
    }
}
