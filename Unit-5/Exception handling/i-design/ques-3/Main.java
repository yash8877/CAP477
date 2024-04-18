import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the stage event start date and end date");

        try {
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss");
            
            String startDateInput = scanner.nextLine();
            startDateInput = addLeadingZeros(startDateInput);
            LocalDateTime startDate = LocalDateTime.parse(startDateInput, formatter);

            
            String endDateInput = scanner.nextLine();
            endDateInput = addLeadingZeros(endDateInput);
            LocalDateTime endDate = LocalDateTime.parse(endDateInput, formatter);

            System.out.println("Start date:" + startDate.format(formatter));
            System.out.println("End date:" + endDate.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
        }
    }

    // Method to add leading zeros for single-digit hours, minutes, and seconds
    private static String addLeadingZeros(String dateTimeInput) {
        String[] components = dateTimeInput.split("-");
        String timeComponent = components[3];
        String[] timeParts = timeComponent.split(":");
        for (int i = 0; i < timeParts.length; i++) {
            if (timeParts[i].length() == 1) {
                timeParts[i] = "0" + timeParts[i];
            }
        }
        components[3] = String.join(":", timeParts);
        return String.join("-", components);
    }
}
