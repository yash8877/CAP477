import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import java.text.ParseException;

public class HallBooking {
	private Hall hall;
    private Event event;
    private Date eventDate;
    private Double price;

    public HallBooking(Hall hall, Event event, String eventDate, String price) {
        this.hall = hall;
        this.event = event;
        try {

        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy"); 
        Date date = sf.parse(eventDate);
        this.eventDate = date;
        }catch(ParseException e) {};

        this.price = Double.parseDouble(price);
        
    }

    public Hall getHall() {
        return this.hall;
    }

    public Event getEvent() {
        return this.event;
    }

    public String getDate() {
          SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
          return sf.format(this.eventDate);
    }

    public String getPrice() {
        return Double.toString(this.price);
    }


    @Override
    public  String toString() {
       return String.format("%-15s%-15s%-15s%-15s", this.getHall().getName(), this.getEvent().getName(), this.getDate(), this.getPrice());
    }

}
