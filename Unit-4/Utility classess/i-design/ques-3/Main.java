import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dates");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] dates = new String[n];
        System.out.println("Enter dates of the events:(dd/MM/yyyy)");
        for (int i = 0; i < n; i++) {
            dates[i] = sc.nextLine();
        }

        int[] daysCount = new int[7]; // Array to store count of events for each day of the week (0 - Sunday, 1 - Monday, ..., 6 - Saturday)

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (String date : dates) {
            try {
                Date eventDate = sdf.parse(date);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(eventDate);
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1 for Sunday, 2 for Monday, ..., 7 for Saturday
                daysCount[dayOfWeek - 1]++; // Increment the count for the corresponding day
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        int maxCount = 0;
        int maxDayIndex = 0;
        for (int i = 0; i < 7; i++) {
            if (daysCount[i] > maxCount) {
                maxCount = daysCount[i];
                maxDayIndex = i;
            }
        }

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("More number of events takes place on " + daysOfWeek[maxDayIndex]);
    }
}
