import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose Stall Type");
        System.out.println("1.Silver Stall");
        System.out.println("2.Gold Stall");
        System.out.println("3.Platinum Stall");

        int ch = Integer.parseInt(s.nextLine());
        if (ch == 1) {
            System.out.println(
                    "Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
            String[] silver = s.nextLine().split(",");
            SilverStall st = new SilverStall(silver[0], silver[1], silver[2], Integer.parseInt(silver[3]));
            st.display();
            System.out.println("Total Cost:" + st.CalculateTotalcost());
        }

        else if (ch == 2) {
            System.out.println(
                    "Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
            String[] gold = s.nextLine().split(",");
            GoldStall gs = new GoldStall(gold[0], gold[1], gold[2], Integer.parseInt(gold[3]),
                    Integer.parseInt(gold[4]));
            gs.show();
            System.out.println("TV Sets:"+gs.getTv());
            System.out.println("Total Cost:" + gs.CalculateTotalcost());

        }

        else if (ch == 3) {
            System.out.println(
                    "Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
            String[] platinum = s.nextLine().split(",");
            PlatinumStall ps = new PlatinumStall(platinum[0], platinum[1], platinum[2], Integer.parseInt(platinum[3]),
                    Integer.parseInt(platinum[4]), Integer.parseInt(platinum[5]));
            ps.info();
            System.out.println("Total Cost:" + ps.CalculateTotalcost());
        }

        else {
            System.exit(0);
        }

    }
}
