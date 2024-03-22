import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of events");
        int n = Integer.parseInt(scanner.nextLine());
         List<Event> events = new ArrayList<>();

        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");

        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(",");
            String eventName = details[0].trim();
            String organiserName = details[1].trim();
            Double eventCost = Double.parseDouble(details[2].trim());
            events.add(new Event(eventName, organiserName, eventCost));
        }

        Event event = new Event();
        event.display(events);
    }
}   