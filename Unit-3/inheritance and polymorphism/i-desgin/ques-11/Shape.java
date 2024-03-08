public class Shape {
    protected Double area;

    public Shape() {
    }

    public Shape(Double area) {
        this.area = area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getArea() {
        return this.area;
    }

    public void computeArea() {
        area = 0.0;
    }
}
