import java.io.*;
import java.text.*;
import java.util.*;
class HallBookingBO {
    public static List<Event> getEventDetails() {
        List<Event> events = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("event.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    events.add(new Event(data[0], data[1], data[2], data[3]));
                } else {
                    System.err.println("Invalid data format in event.csv: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading event.csv: " + e.getMessage());
        }
        return events;
    }

    public static List<Hall> getHallDetails() {
        List<Hall> halls = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("hall.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    halls.add(new Hall(data[0], data[1], Double.parseDouble(data[2]), data[3]));
                } else {
                    System.err.println("Invalid data format in hall.csv: " + line);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading hall.csv: " + e.getMessage());
        }
        return halls;
    }

    public static List<HallBooking> getBookingDetails(List<Event> events, List<Hall> halls) {
        List<HallBooking> bookings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("booking.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    Hall hall = findHallByName(halls, data[0]);
                    Event event = findEventByName(events, data[1]);
                    if (hall != null && event != null) {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        Date startDate = dateFormat.parse(data[2]);
                        Date endDate = dateFormat.parse(data[3]);
                        Double price = Double.parseDouble(data[4]);
                        bookings.add(new HallBooking(hall, event, startDate, endDate, price));
                    }
                } else {
                    System.err.println("Invalid data format in booking.csv: " + line);
                }
            }
        } catch (IOException | ParseException | NumberFormatException e) {
            System.err.println("Error reading booking.csv: " + e.getMessage());
        }
        return bookings;
    }

public static void writeHallBooking(String hallName, List<HallBooking> bookings) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    try (PrintWriter writer = new PrintWriter(new FileWriter("result.csv"))) {
        for (HallBooking booking : bookings) {
            if (booking.getHall().getName().equalsIgnoreCase(hallName)) {
                writer.println(booking.getEvent().getName() + "," +
                               dateFormat.format(booking.getStartDate()) + "," +
                               dateFormat.format(booking.getEndDate()) + "," +
                               booking.getPrice());
            }
        }
    } catch (IOException e) {
        System.err.println("Error writing to result.csv: " + e.getMessage());
    }
}


    private static Hall findHallByName(List<Hall> halls, String name) {
        for (Hall hall : halls) {
            if (hall.getName().equalsIgnoreCase(name)) {
                return hall;
            }
        }
        return null;
    }

    private static Event findEventByName(List<Event> events, String name) {
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(name)) {
                return event;
            }
        }
        return null;
    }
}
