import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FileWriter fr = new FileWriter("output.txt");
		Scanner sc = new Scanner(System.in);

		//fill your code here
		ItemBO bo = new ItemBO();
		List<Item> items = new ArrayList<>();

		System.out.println("Enter number of items purchased");
		int n = sc.nextInt();

		if(n <= 0) {
			System.out.println("Invalid Input");
			return;
		}
		sc.nextLine();

		for(int i = 0; i < n; i++) {
			System.out.println("Enter item details in CSV(Item Number,Vendor Name,ItemType Name,Cost)");
			String[] s = sc.nextLine().split(",");
			Integer inum = Integer.parseInt(s[0]);

			String vendor = s[1];
			ItemType itemtype = new ItemType(s[2], Double.parseDouble(s[3]));

			items.add(new Item(inum, vendor, itemtype));
		}

		bo.writeFile(items, fr);
		
	}
}