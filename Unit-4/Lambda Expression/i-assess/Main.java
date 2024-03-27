import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of item types:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        List<ItemType> itemTypes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(",");
            ItemType item = new ItemType(details[0], Double.parseDouble(details[1]), Double.parseDouble(details[2]));
            itemTypes.add(item);
        }
        Collections.sort(itemTypes, Comparator.comparing(ItemType::getName));

        System.out.printf("%-10s %-10s %s\n", "Name", "Cost", "Deposit");
        for (ItemType item : itemTypes) {
            System.out.printf("%-10s %-10s %s\n", item.getName(), item.getCostPerDay(), item.getDeposit());
        }
    }
}