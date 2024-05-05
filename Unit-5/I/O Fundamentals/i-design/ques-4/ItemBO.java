import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.TreeMap;

public class ItemBO {
	
	public static ArrayList<Item> readFile(BufferedReader br,ArrayList<ItemType> typeList) throws Exception {
		//write your code here
		ArrayList<Item> items = new ArrayList<>();
		String line;

		while((line = br.readLine()) != null) {
			String number = line.substring(0, 9).trim();
			String itemtype = line.substring(9, 23).trim();
			String vendor = line.substring(24).trim();

			for(ItemType i : typeList) {
				if(i.getName().equals(itemtype)) {
					items.add(new Item(number, i, vendor));
					break;
				}
			}
			
		}

		return items;

	}
	
	public static TreeMap<String, Integer> listItem(ArrayList<Item> itemList) {
		//write your code here
		TreeMap<String, Integer> itemtypes = new TreeMap<>();

		for(Item i : itemList) {
			if(itemtypes.containsKey(i.getName())) {
				itemtypes.put(i.getName(), itemtypes.get(i.getName()) + 1);
			}else {
				itemtypes.put(i.getName(), 1);
			}
		}

		return itemtypes;

	}
}