public class Event {
    private String eventName;
    private Integer attendeesCount;
    private String ownerName;

    public Event() {
        // Default constructor
    }

    public Event(String eventName, Integer attendeesCount, String ownerName) {
        this.eventName = eventName;
        this.attendeesCount = attendeesCount;
        this.ownerName = ownerName;
    }

    // Getters and setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Integer getAttendeesCount() {
        return attendeesCount;
    }

    public void setAttendeesCount(Integer attendeesCount) {
        this.attendeesCount = attendeesCount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}