import java.util.ArrayList;

public class Hall {
		private String name; 	
		private String 	contactNumber;
		private Double	costPerDay;
		private String 	ownerName;

        public Hall() {};
        
        public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
            this.name = name;
            this.contactNumber = contactNumber;
            this.costPerDay = costPerDay;
            this.ownerName = ownerName;
        }

        public String getName() {
            return this.name;
        }
        public Hall hallpresent(ArrayList<Hall> halls, String s) throws HallNotAvailableException {
            for(Hall h : halls) {
                if(h.getName().equals(s)) return h;
            }
           throw new HallNotAvailableException("Hall or Event does not exist");
        }
}