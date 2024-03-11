import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
        int ch = Integer.parseInt(sc.nextLine());
        
        switch (ch) {
            case 1:
                System.out.println("Enter the details in CSV format");
                String[] input = sc.nextLine().split(",");
                Exhibition e = new Exhibition(input[0], input[1], input[2], input[3], Integer.parseInt(input[4]),
                        Double.parseDouble(input[5]));
                System.out.println("Exhibition Details");
                e.display();
                break;
            case 2:
                System.out.println("Enter the details in CSV format");
                String[] input2 = sc.nextLine().split(",");
                StageEvent e1 = new StageEvent(input2[0], input2[1], input2[2], input2[3], Integer.parseInt(input2[4]),
                        Double.parseDouble(input2[5]));
                System.out.println("Stage Event Details");
                e1.display(); //
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
