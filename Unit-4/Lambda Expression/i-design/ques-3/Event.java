import java.util.*;
import java.util.stream.Collectors;
class Event {
    private String eventName;
    private String eventType;
    private String organizer;
    public Event() {}
    public Event(String eventName, String eventType, String organizer) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.organizer = organizer;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public static List<Event> filterEvents(List<Event> eventList, String name, int id) {
        List<Event> filteredEvents = new ArrayList<>();

        switch (id) {
            case 1:
                filteredEvents = eventList.stream()
                        .filter(event -> event.getEventName().equalsIgnoreCase(name))
                        .collect(Collectors.toList());
                break;
            case 2:
                filteredEvents = eventList.stream()
                        .filter(event -> event.getEventType().equalsIgnoreCase(name))
                        .collect(Collectors.toList());
                break;
            case 3:
                filteredEvents = eventList.stream() .filter(event -> event.getOrganizer().equalsIgnoreCase(name)).collect(Collectors.toList());
                break;
        }
        return filteredEvents;
    }
}   
