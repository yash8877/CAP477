import java.util.ArrayList;
import java.util.List;

public class Event {
	//Your code here
	private String name;
	private String detail;
	private String type;
	private String organiserName;

	public static List<Event> prefill(){
		List<Event> eventList=new ArrayList<>();
		eventList.add(new Event("Book Sale","Special sale","Academics","Ahamed"));
		eventList.add(new Event("PCB workshop","open for all","Academics","Antony"));
		eventList.add(new Event("Lathe workshop","only academicians","Academics","Vishnu"));
		eventList.add(new Event("Magic show","Comedy magic","Entertainment","Rathnam"));
		return eventList;
	}
	
	public Event(String name, String detail, String type, String organiserName) {
		this.name = name;
		this.detail = detail;
		this.type= type;
		this.organiserName = organiserName;
	}

	public String getName() {
		return this.name;
	}
}
