import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose Stall Type");
        System.out.println("1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
        int ch = Integer.parseInt(sc.nextLine());
        if (ch == 1) {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
            String []detail = sc.nextLine().split(",");
            GoldStall gs = new GoldStall(detail[0],Integer.parseInt(detail[1]),detail[2],Integer.parseInt(detail[3]));
            gs.display();
        }
        else if(ch == 2){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
            String []info = sc.nextLine().split(",");
            PremiumStall ps = new PremiumStall(info[0],Integer.parseInt(info[1]),info[2],Integer.parseInt(info[3]));
            ps.display();
        }
        else if(ch == 3){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
            String[] input = sc.nextLine().split(",");
            ExecutiveStall es = new ExecutiveStall(input[0], Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]));
            es.display();
        }
        else{
            System.out.println("Invalid Stall Type");
        }
    }
}
