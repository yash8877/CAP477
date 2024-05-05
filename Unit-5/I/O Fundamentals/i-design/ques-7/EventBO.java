import java.io.*;
import java.util.*;

public class EventBO {
    public List<Event> readFromFile(BufferedReader br) throws IOException {
        List<Event> eventList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {  
                String eventName = parts[0].trim();
                Integer attendeesCount = Integer.parseInt(parts[1].trim());
                String ownerName = parts[2].trim();

                Event event = new Event(eventName, attendeesCount, ownerName);
                eventList.add(event);
            }
        }

        return eventList;
    }

    public void writeFile(List<Event> eventList, FileWriter fw) throws IOException {
        Set<String> owners = new HashSet<>();  

        for (Event event : eventList) {
            if (!owners.contains(event.getOwnerName())) { 
                fw.write(String.format("%s,%d,%s\n", event.getEventName(), event.getAttendeesCount(), event.getOwnerName()));
                owners.add(event.getOwnerName());
            }
        }

        fw.flush();  // Ensure data is written to the file
    }
}