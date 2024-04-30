public class EventType {
	private Long id;
    private String name;

    public EventType(String name, Long id) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }
}