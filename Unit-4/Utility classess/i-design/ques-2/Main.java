import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
        String input = sc.nextLine();
        LocalDate convert = LocalDate.parse(input,inputFormatter);

        DateTimeFormatter myFormatter3 = DateTimeFormatter.ofPattern("EEE, MMM d, yy");
        System.out.println("Date Format with EEE, MMM d, yy : "+convert.format(myFormatter3));
        DateTimeFormatter myFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Date Format with dd.MM.yyyy : "+convert.format(myFormatter1));
        DateTimeFormatter myFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date Format with dd dd/MM/yyyy : "+convert.format(myFormatter2));

    }
}
