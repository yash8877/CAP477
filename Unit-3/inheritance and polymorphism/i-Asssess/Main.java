import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stall st = new Stall();
        System.out.println("Enter the name of the stall:");
        String name = sc.nextLine();
        System.out.println("Enter the detail of the stall:");
        String detsil = sc.nextLine();
        System.out.println("Enter the owner name of the stall:");
        String owner = sc.nextLine();
        System.out.println("Enter the type of the stall:");
        String type = sc.nextLine();
        System.out.println("Enter the size of the stall in square feet:");
        int sq = sc.nextInt();
        System.out.println("Does the stall have TV?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("Enter the number of TV:");
            int tv = sc.nextInt();
            System.out.println("The cost of the stall is " + st.computeCost(type, sq, tv));
        } else {
            System.out.println("The cost of the stall is " + st.computeCost(type, sq));
        }

    }
}
