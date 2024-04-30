import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hall> halls = new ArrayList<>();
        ArrayList<Event> events = new ArrayList<>();
        ArrayList<HallBooking> bookings = new ArrayList<>();

        // Hardcoded values
        halls.add(new Hall("Sdf hall", "1234567890", 15000.0, "John Doe"));
        halls.add(new Hall("TUV hall", "0987654321", 20000.0, "Jane Smith"));

        events.add(new Event("Book Fair", "Annual book fair", "Library Association", "Fair"));
        events.add(new Event("Furniture Fair", "Exhibition of furniture", "Furniture Association", "Exhibition"));

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("Enter the booking details:");
            String input = scanner.nextLine();
            String[] details = input.split(",");
            String hallName = details[0].trim();
            String eventName = details[1].trim();
            String eventDateStr = details[2].trim();
            Double price = Double.parseDouble(details[3].trim());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date eventDate = null;
            try {
                eventDate = dateFormat.parse(eventDateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in dd-MM-yyyy format.");
                continue;
            }

            Hall hall = null;
            Event event = null;

            for (Hall h : halls) {
                if (h.getName().equals(hallName)) {
                    hall = h;
                    break;
                }
            }

            for (Event e : events) {
                if (e.getName().equals(eventName)) {
                    event = e;
                    break;
                }
            }


            try {
            if (hall == null || event == null) {
                throw new HallNotAvailableException("Hall or Event does not exist");
            }
            HallBooking booking = new HallBooking(hall, event, eventDate, price);

                if (HallBookingBO.validateHallBooking(bookings, booking)) {
                    bookings.add(booking);
                }
            } catch (HallNotAvailableException e) {
                System.out.println(e);
            }

            System.out.println("Do you want to continue?(y/n)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("The bookings entered are:");
        System.out.println("Hall id        Event id       Event date     Price");
        for (HallBooking booking : bookings) {
            System.out.println(booking);
        }
    }
}

