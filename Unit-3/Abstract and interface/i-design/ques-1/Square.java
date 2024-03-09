public class Square extends Shape{
    private float side;
    public Square(float side){
        this.side = side;
    }
    public double calculatePerimeter(){
        return 4 * side;
    }
}
