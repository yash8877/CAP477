class Exhibition extends Event {
    private Integer noOfStalls;

    public Exhibition(String name, String detail, String ownerName, Integer noOfStalls) {
        super(name, detail, ownerName);
        this.noOfStalls = noOfStalls;
    }

    @Override
    public Double projectedRevenue() {
        return noOfStalls * 10000.0; 
    }
}