public class Rectangle extends Shape{
    private float length;
    private float breadth;
    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double calculatePerimeter(){
        return 2* (length + breadth);
    }
}
