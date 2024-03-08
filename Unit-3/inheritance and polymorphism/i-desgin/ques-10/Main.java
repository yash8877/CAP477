import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the event:");
        String name = sc.nextLine();
        System.out.println("Enter the detail of the event:");
        String detail = sc.nextLine();
        System.out.println("Enter the owner name of the event:");
        String ownerName = sc.nextLine();
        Event ev;
        System.out.println("Enter the type of the event:");
        System.out.println("1.Exhibition\n2.StageEvent");
        int ch = Integer.parseInt(sc.nextLine());
        if (ch == 1) {
            System.out.println("Enter the number of stalls:");
            int stall = sc.nextInt();
            ev = new Exhibition(name, detail, ownerName, stall);
        } else if (ch == 2) {
            System.out.println("Enter the number of shows:");
            int noOfShows = sc.nextInt();
            System.out.println("Enter the number of seats per show:");
            int noOfSeatsPerShow = sc.nextInt();
            ev = new StageEvent(name, detail, ownerName, noOfShows, noOfSeatsPerShow);
        } else {
            System.out.println("Invalid event type.");
            return;
        }
        System.out.println("The projected revenue of the event is " + ev.projectedRevenue());
    }
}
