import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class HallBookingBO {
	//Your code here

	public List<HallBooking> readFile(BufferedReader br,List<Hall> hallList,List<Event> eventList) {
		List<HallBooking> hallbooking = new ArrayList<>();
		String line;

		try {

		while((line = br.readLine()) != null) {
			String hallname = line.substring(0, 10).trim();
			String eventname = line.substring(10, 25).trim();
			String startdate = line.substring(25, 35).trim();
			String enddate = line.substring(35, 45).trim();
			String price = line.substring(45, 50).trim();

			Hall hall = null;
			Event event = null;
			for(Hall h : hallList) {
				if(h.getName().equals(hallname)) {
					hall = h;
					break;
				}
			}

			for(Event e : eventList) {
				if(e.getName().equals(eventname)) {
					event = e;
					break;
				}
			}
		

				hallbooking.add(new HallBooking(hall, event, startdate, enddate, price));
		} 

		}catch(IOException e) {
			e.printStackTrace();
		}

		return hallbooking;

	}

	public Map<String,Integer> showDetails(List<HallBooking> list) {
		Map<String, Integer> details = new TreeMap<>();

		for(HallBooking hb : list) {
			if(details.containsKey(hb.getName())) {
				details.put(hb.getName(), details.get(hb.getName()) + 1);
			}else {
				details.put(hb.getName(), 1);
			}
		}

		return details;
	}
}