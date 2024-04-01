import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of Events");
        int n = Integer.parseInt(scanner.nextLine());

        List<Event> events = new ArrayList<>();
        System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
        for (int i = 0; i < n; i++) {

            String[] eventDetails = scanner.nextLine().split(",");
            String eventName = eventDetails[0];
            Date startDate = dateFormat.parse(eventDetails[1]);
            Date endDate = dateFormat.parse(eventDetails[2]);
            Event event = new Event(eventName, startDate, endDate);
            events.add(event);
        }

        List<String> oneDayEvents = new ArrayList<>();
        for (Event event : events) {
            if (isOneDayEvent(event)) {
                oneDayEvents.add(event.getEventName());
            }
        }

        System.out.println("1-day Events:");
        if (oneDayEvents.isEmpty()) {
            System.out.println("No Events");
        } else {
            for (String eventName : oneDayEvents) {
                System.out.println(eventName);
            }
        }
    }

    private static boolean isOneDayEvent(Event event) {
        return event.getStartDate().equals(event.getEndDate());
    }
}
