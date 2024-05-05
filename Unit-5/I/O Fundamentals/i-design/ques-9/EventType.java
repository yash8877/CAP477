import java.io.*;
import java.util.*;
class EventType {
    private String name;

    public EventType() {}

    public EventType(String name) {
        this.name = name;
    }

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public static List<EventType> getEventType(List<Event> events) {
        Set<String> eventTypeNames = new TreeSet<>();
        for (Event event : events) {
            eventTypeNames.add(event.getType().getName());
        }
        List<EventType> eventTypes = new ArrayList<>();
        for (String name : eventTypeNames) {
            eventTypes.add(new EventType(name));
        }
        return eventTypes;
    }
}