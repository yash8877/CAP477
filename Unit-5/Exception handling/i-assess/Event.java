import java.util.ArrayList;

public class Event {
		private String name;
		private String detail;
		private String ownerName;
		private String type;

        public Event() {};

        public Event(String name, String detail, String ownerName, String type) {
            this.name = name;
            this.detail = detail;
            this.ownerName = ownerName;
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public Event eventpresent(ArrayList<Event> events, String s) throws HallNotAvailableException {
            for(Event e : events) {
                if(e.getName().equals(s)) return e;
            }

           throw new HallNotAvailableException("Hall or Event does not exist");
        }
}
