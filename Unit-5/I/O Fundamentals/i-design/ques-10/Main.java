import java.io.*;
import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hall name to be searched:");
        String hallName = scanner.nextLine().trim();

        List<Event> events = HallBookingBO.getEventDetails();
        List<Hall> halls = HallBookingBO.getHallDetails();
        List<HallBooking> bookings = HallBookingBO.getBookingDetails(events, halls);
        HallBookingBO.writeHallBooking(hallName, bookings);
        System.out.println("Booking details for " + hallName + " have been written to result.csv");
    }
}
