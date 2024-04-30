import java.util.Date;
import java.text.SimpleDateFormat;

class HallBooking {
    private Hall hall;
    private Event event;
    private Date eventDate;
    private Double price;

    public HallBooking(Hall hall, Event event, Date eventDate, Double price) {
        this.hall = hall;
        this.event = event;
        this.eventDate = eventDate;
        this.price = price;
    }

    // Getters and setters
    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-15s%-15s%-15s%-15s", hall.getName(), event.getName(), dateFormat.format(eventDate), price);
    }
}