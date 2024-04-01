import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");

        System.out.println("Enter the Dates: ");
        String input = sc.nextLine();
        String[] dateStrings = input.split("\\s+");

        DateTimeFormatter requiredFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatted dates:");

        StringBuilder formattedDates = new StringBuilder();
        for (int i = 0; i < dateStrings.length; i++) {
            LocalDate convert = LocalDate.parse(dateStrings[i], myFormatter);
            formattedDates.append(convert.format(requiredFormatter)).append("\n");
        }
        
        System.out.println(formattedDates.toString());
    }
}
