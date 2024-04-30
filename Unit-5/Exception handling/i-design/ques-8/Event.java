
public class Event {
	private String name;
    private String detail;
    private String ownerName;
    private Long typeId;

    public Event(String name, String detail, String ownerName, Long typeId) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.detail + "\t" + this.ownerName + "\t" + this.typeId;
    }
}
