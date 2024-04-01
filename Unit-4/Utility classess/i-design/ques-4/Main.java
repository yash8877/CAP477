import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dates: ");
        String input[] = sc.nextLine().split(" ");
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    }
}
