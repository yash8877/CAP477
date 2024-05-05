import java.io.*;
import java.text.*;
import java.util.*;
class HallBooking {
    private Hall hall;
    private Event event;
    private Date startDate;
    private Date endDate;
    private Double price;

    public HallBooking() {}

    public HallBooking(Hall hall, Event event, Date startDate, Date endDate, Double price) {
        this.hall = hall;
        this.event = event;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    // Getters and setters
    public Hall getHall() { return hall; }
    public void setHall(Hall hall) { this.hall = hall; }

    public Event getEvent() { return event; }
    public void setEvent(Event event) { this.event = event; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
