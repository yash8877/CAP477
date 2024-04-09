import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter the number of event details");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Event[] events = new Event[n];

        for (int i = 0; i < n; i++) {
            String[] eventDetails = scanner.nextLine().split(",");
            String eventName = eventDetails[0];
            Date date = dateFormat.parse(eventDetails[1]);
            int attendeesCount = Integer.parseInt(eventDetails[2]);
            events[i] = new Event(eventName, date, attendeesCount);
        }

        System.out.println("Enter the Date");
        Date givenDate = dateFormat.parse(scanner.nextLine());

        Calendar cal = Calendar.getInstance();
        cal.setTime(givenDate);
        int weekNumber = cal.get(Calendar.WEEK_OF_YEAR);

        int totalAttendeesCount = 0;
        for (Event event : events) {
            cal.setTime(event.getDate());
            int eventWeekNumber = cal.get(Calendar.WEEK_OF_YEAR);
            if (eventWeekNumber == weekNumber) {
                totalAttendeesCount += event.getAttendeesCount();
            }
        }

        System.out.println("Week number:" + weekNumber);
        System.out.println("Attendees count for the week is " + totalAttendeesCount);

        scanner.close();
    }
}