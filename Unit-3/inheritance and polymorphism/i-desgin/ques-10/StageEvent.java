class StageEvent extends Event {
    private Integer noOfShows;
    private Integer noOfSeatsPerShow;

    public StageEvent(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerShow) {
        super(name, detail, ownerName);
        this.noOfShows = noOfShows;
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }

    @Override
    public Double projectedRevenue() {
        return noOfShows * noOfSeatsPerShow * 50.0;
    }
}