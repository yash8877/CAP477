import java.io.*;
import java.text.*;
import java.util.*;
class Event {
    private String name;
    private String detail;
    private String type;
    private String owner;
    private List<Hall> hallList;

    public Event() {}

    public Event(String name, String detail, String type, String owner) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.owner = owner;
        this.hallList = new ArrayList<>();
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public List<Hall> getHallList() { return hallList; }
    public void setHallList(List<Hall> hallList) { this.hallList = hallList; }
}