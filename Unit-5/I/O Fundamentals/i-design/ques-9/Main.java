import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Event> events = readEventsFromFile("event.csv");
        if (events != null) {
            List<EventType> eventTypes = EventType.getEventType(events);
            writeEventTypesToFile(eventTypes, "eventtype.csv");
            System.out.println("Event types have been written to eventtype.csv");
        } else {
            System.out.println("Failed to read events from file.");
        }
    }

    private static List<Event> readEventsFromFile(String filename) {
        List<Event> events = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    events.add(new Event(data[0], data[1], new EventType(data[2]), data[3]));
                } else {
                    System.err.println("Invalid data format: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
        return events;
    }


    private static void writeEventTypesToFile(List<EventType> eventTypes, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < eventTypes.size(); i++) {
                writer.print(eventTypes.get(i).getName());
                if (i < eventTypes.size() - 1) {
                    writer.print(",");
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}