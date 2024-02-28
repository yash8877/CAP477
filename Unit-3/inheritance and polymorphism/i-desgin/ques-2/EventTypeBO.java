import java.util.*;
class EventTypeBO {
    public void display(ArrayList<EventType> list) {
        for (EventType eventType : list) {
            eventType.display();
        }
    }
}