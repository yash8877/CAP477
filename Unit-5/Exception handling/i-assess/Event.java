class Event {
    private String name;
    private String detail;
    private String ownerName;
    private String type;

    public Event(String name, String detail, String ownerName, String type) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.type = type;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Event id: %-15s Detail: %-15s Owner: %-15s Type: %-15s",
                name, detail, ownerName, type);
    }
}