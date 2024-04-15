import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the item for n days");
        int a = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        try {
            int c = a / n;
            System.out.println("Cost per day of the item is "+c);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

    }
}
