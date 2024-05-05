import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventBO eventBO = new EventBO();  // Create an instance of EventBO

        try {
            // Read event details from the input file
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            List<Event> eventList = eventBO.readFromFile(br);
            br.close();

            // Write unique event details to the output file
            FileWriter fw = new FileWriter("output.txt");
            eventBO.writeFile(eventList, fw);  // Write to output.txt after removing duplicates
            fw.close();  // Ensure file is closed

            System.out.println("Events have been written to output.txt with unique owners.");

        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}