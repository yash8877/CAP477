public class Circle extends Shape{
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }
    public double calculatePerimeter(){
        return 3.14 * 2 * radius;
    }
}
