import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Booking details");
        String[] details = sc.nextLine().split(",");
        TicketBooking tb = new TicketBooking(details[0], details[1], Integer.parseInt(details[2]));
        System.out.println("Payment Mode");
        System.out.println("1.Cash payment");
        System.out.println("2.Wallet payment");
        System.out.println("3.Credit card payment");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch) {
            case 1:
                System.out.println("Enter the amount");
                double cashAmount = sc.nextDouble();
                tb.makePayment(cashAmount);
                break;
            case 2:
                System.out.println("Enter the amount");
                double waletAmount = sc.nextDouble();
                System.out.println("Enter the wallet number");
                String num = sc.next();
                tb.makePayment(waletAmount, num);
                break;
            case 3:
                System.out.println("Enter the card holder name");
                String name = sc.next();
                System.out.println("Enter the amount");
                double creditamount = sc.nextDouble();
                System.out.println("Enter the credit card type");
                String cardType = sc.next();
                tb.makePayment(name, creditamount, cardType);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

    }
}
