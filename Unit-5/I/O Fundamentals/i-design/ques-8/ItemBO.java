import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

public class ItemBO {
	//fill your code here
	public void writeFile(List<Item> itemList,FileWriter fr) throws IOException {
		DecimalFormat df = new DecimalFormat("#.0#");
		for(Item i : itemList) {
			String content = String.format("%d,%s,%s,%s\n", i.getItemNumber(), i.getVendor(), i.getItemTypeName(), df.format(i.getItemCost()));
			fr.write(content);
		}

		fr.flush();
	}
}