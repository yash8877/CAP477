import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("List of Shapes:");
        System.out.println("1.Circle\n2.Rectangle\n3.Square");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.println("Enter the radius of the Circle:");
            float rad = sc.nextFloat();
            Circle c = new Circle(rad);
            System.out.println("The perimeter is "+String.format("%.2f", c.calculatePerimeter()));
        }
        else if(ch == 2){
            System.out.println("Enter the length of the Rectangle:");
            float len = sc.nextFloat();
            System.out.println("Enter the breadth of the Rectangle:");
            float bred = sc.nextFloat();
            Rectangle r = new Rectangle(len, bred);
            System.out.println("The perimeter is "+String.format("%.2f", r.calculatePerimeter()));
        }
        else if(ch == 3){
            System.out.println("Enter the side of the Square:");
            float side = sc.nextFloat();
            Square s = new Square(side);
            System.out.println("The perimeter is "+String.format("%.2f", s.calculatePerimeter()));
        }
    }
}
