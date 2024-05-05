import java.util.ArrayList;
import java.util.List;

public class Hall{
	public static List<Hall> prefill(){
		List<Hall> hallList=new ArrayList<>();
		hallList.add(new Hall("RR hall","9876543210",5000.0,"Mahesh"));
		hallList.add(new Hall("KK hall","9879879879",15000.0,"Ganesh"));
		hallList.add(new Hall("JJ hall","9876543210",10000.0,"Rajesh"));
		hallList.add(new Hall("ARM hall","9876543210",8000.0,"Ashwin"));
		return hallList;
	}
    	//Your code here
		private String name; 
		private String contactNumber;
		private Double costPerDay;
		private String ownerName;

		public Hall(String name, String contactNumber, Double costPerDay,String ownerName) {
			this.name = name;
			this.contactNumber = contactNumber;
			this.costPerDay = costPerDay;
			this.ownerName = ownerName;
		}

		public String getName() {
			return this.name;
		}
}