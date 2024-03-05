import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account Detail:");
        String detail = s.nextLine();

        AccountBO bo = new AccountBO();
        FixedAccount fa = bo.getAccountDetail(detail);
        System.out.println("Account Details:");
        System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
                "Minimum balance", "Locking period");
        System.out.format("%-20s %-10s %-20s %-20s %s\n", fa.accountNumber, fa.balance, fa.accountHolderName,
                fa.minimumBalance, fa.getlocking());

    }
}
