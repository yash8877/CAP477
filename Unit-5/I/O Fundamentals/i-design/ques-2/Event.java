public class Event {
	//write your code here
	private String name;
	private String detail;
	private String type;
	private String organiser;
	private Integer attendeesCont;
	private Double projectedExpense;

	public Event(String name, String detail, String type, String organiser, String attendeesCont, String projectedExpense) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
		this.attendeesCont = Integer.parseInt(attendeesCont);
		this.projectedExpense = Double.parseDouble(projectedExpense);
	}

	public String getOrganiser() {
		return this.organiser;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-20s%-15s%-15s%-15s", this.name, this.detail, this.type, this.attendeesCont, this.projectedExpense);
	}
}
