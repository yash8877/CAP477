public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    public TicketBooking() {
        this.stageEvent = "";
        this.customer = "";
        this.noOfSeats = 0;
    }

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

    public void makePayment(double amount){
        
    }
    public void makePayment(String walletNumber,double amount){}
    public void makePayment(String creditCard,String ccv,String name,double amount){}
}
