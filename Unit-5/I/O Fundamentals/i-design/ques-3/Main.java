import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args){
		//Your code here
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));

			ItemTypeBO bo = new ItemTypeBO();

			List<ItemType> items = bo.readFromFile(br);
			List<ItemType> filteredItems =  bo.depositList(items);

			bo.display(filteredItems);
			

		}

		catch(IOException e) {
			e.printStackTrace();
		}
			
	}

}
