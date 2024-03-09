public class Stall {
    protected String name;
    protected String detail;
    protected String ownerName;

    public Stall() {
    }

    public Stall(String name, String detail, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
    }

    public Double computeCost(String stallType, Integer squareFeet) {
        if (stallType.equalsIgnoreCase("Platinum")) {
            return squareFeet * 200.0;
        } else if (stallType.equalsIgnoreCase("Diamond")) {
            return squareFeet * 150.0;
        } else if (stallType.equalsIgnoreCase("Gold")) {
            return squareFeet * 100.0;
        } else {
            return 0.0;
        }
    }

    public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
        Double total = computeCost(stallType, squareFeet);
        Double totalTV = numberOfTV * 10000.0;
        return total + totalTV;
    }

}
