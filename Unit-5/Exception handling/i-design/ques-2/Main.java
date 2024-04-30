import java.io.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the Item type details:");
            System.out.println("Enter the name:");
            String name = br.readLine();
            System.out.println("Enter the deposit:");
            Double deposit = Double.parseDouble(br.readLine());
            System.out.println("Enter the cost per day:");
            Double costPerDay = Double.parseDouble(br.readLine());
            ItemType it = new ItemType(name,deposit,costPerDay);
             System.out.println("The details of the item type are:\n"+it);
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.toString());
        }
    }
}
