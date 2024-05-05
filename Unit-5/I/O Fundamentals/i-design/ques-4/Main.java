import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<ItemType> itemTypeList=new ArrayList<>();
		itemTypeList.add(new ItemType("Electronics",new Double(1000),new Double(100)));
		itemTypeList.add(new ItemType("Furniture",new Double(1000),new Double(100)));
		itemTypeList.add(new ItemType("Decorations",new Double(1000),new Double(100)));
		
		//write your code here
		try {
			BufferedReader br  = new BufferedReader(new FileReader("input.csv"));

			ItemBO bo = new ItemBO();

			ArrayList<Item> items = bo.readFile(br, itemTypeList);

			TreeMap<String , Integer> itemtypes = ItemBO.listItem(items);

			System.out.println("The item types along with count of each:");

			for(String key: itemtypes.keySet()) {
				System.out.println(key + "--" + itemtypes.get(key));
			}
			

		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
