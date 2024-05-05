class Event {
    private String name;
    private String detail;
    private EventType type;
    private String organizer;

    public Event() {}

    public Event(String name, String detail, EventType type, String organizer) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organizer = organizer;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }

    public EventType getType() { return type; }
    public void setType(EventType type) { this.type = type; }

    public String getOrganizer() { return organizer; }
    public void setOrganizer(String organizer) { this.organizer = organizer; }
}
