import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Event {
    private String eventName;
    private Date date;
    private int attendeesCount;

    public Event(String eventName, Date date, int attendeesCount) {
        this.eventName = eventName;
        this.date = date;
        this.attendeesCount = attendeesCount;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getDate() {
        return date;
    }

    public int getAttendeesCount() {
        return attendeesCount;
    }
}