import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;


public class EventBO {
	
	public static ArrayList<Event> readFile(BufferedReader br) throws Exception {
		//write your code here
		ArrayList<Event> events = new ArrayList<>();
		try {
			String line;
			while((line = br.readLine()) != null) {
				String a = line.substring(0, 19).trim();
				String b = line.substring(19, 39).trim();
				String c = line.substring(39, 51).trim();
				String d = line.substring(51, 61).trim();
				String e = line.substring(61, 67).trim();
				String f = line.substring(67, 74).trim();
				events.add(new Event(a, b, c, d, e, f));
			}
		}catch(IOException e) {}
		
		return events;
	}
	
	public static ArrayList<Event> eventsByPerson(ArrayList<Event> eventList,String organiser) {
		//write your code here
		ArrayList<Event> events = new ArrayList<>();

			for(Event e : eventList) {
				if(e.getOrganiser().equals(organiser)) {
					events.add(e);
				}
			}

			return events;
	}
}