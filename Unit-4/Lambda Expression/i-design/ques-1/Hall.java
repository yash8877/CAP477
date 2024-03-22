class Hall {
    private String name;
    private double costPerDay;
    private String owner;

    public Hall(String name, double costPerDay, String owner) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public String getOwner() {
        return owner;
    }
}