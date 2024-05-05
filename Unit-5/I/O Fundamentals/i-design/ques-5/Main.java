import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

		public static void main(String[] args){
			//Your code here
			try {
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));

				HallBookingBO bo = new HallBookingBO();

				List<HallBooking> hallbookings = bo.readFile(br, Hall.prefill(), Event.prefill());
				
				Map<String , Integer> details = bo.showDetails(hallbookings);

				System.out.printf("%-10s %s\n", "Hall name", "No of events");
				for(String key : details.keySet()) {
					System.out.printf("%-10s %s\n", key, details.get(key));
				}

			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
