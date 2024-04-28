import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        dateFormat.setLenient(false); // This will cause the date format to strictly match the given pattern

        System.out.println("Enter the stage event start date and end date");

        // Prompt for start date
        // System.out.print("Start date:");
        String startDateStr = getNextLineOrEmpty(scanner);

        // Prompt for end date
        // System.out.print("End date:");
        String endDateStr = getNextLineOrEmpty(scanner);

        try {
            // Parse start date
            Date startDate = dateFormat.parse(startDateStr);

            // Parse end date
            Date endDate = dateFormat.parse(endDateStr);

            // Output parsed dates
            System.out.println("Start date:" + dateFormat.format(startDate));
            System.out.println("End date:" + dateFormat.format(endDate));
        } catch (ParseException e) {
            // Exception occurred, notify the user about the right format
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
        }
    }

    private static String getNextLineOrEmpty(Scanner scanner) {
        return scanner.hasNextLine() ? scanner.nextLine() : "";
    }
}
