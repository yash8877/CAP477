import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Booking details");
        String[] details = sc.nextLine().split(",");
        System.out.println("Payment Mode");
        System.out.println("1.Cash payment");
        System.out.println("2.Wallet payment");
        System.out.println("3.Credit card payment");
        int ch = sc.nextInt();
        sc.nextLine();
        TicketBooking tb = new TicketBooking();


    }
}
