import java.util.*;

class Main
{
    public static void main(String args[])
    {
                Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of events");
        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        List<Event> events = new ArrayList<>();

        System.out.println("Enter event details in CSV(Event Name,Event Type,Orgnaizer Name)");

        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(",");
            String eventName = details[0].trim();
            String eventType = details[1].trim();
            String organizer = details[2].trim();
            events.add(new Event(eventName, eventType, organizer));
        }

        System.out.println("Filter:");
        System.out.println("1)Using Event name");
        System.out.println("2)Using Event type");
        System.out.println("3)Using Organizer name");
        System.out.println("Choice:");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter value:");
        String value = scanner.nextLine();

        List<Event> filteredEvents = Event.filterEvents(events, value, choice);
        if (filteredEvents.isEmpty()) {
            System.out.println("No results found");
        } else {
            filteredEvents.forEach(event -> System.out.println(event.getEventName() + "|" + event.getEventType() + "|" + event.getOrganizer()));
        }

        scanner.close();
    }
}
