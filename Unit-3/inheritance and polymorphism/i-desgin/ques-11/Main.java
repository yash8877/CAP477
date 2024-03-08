import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Enter the radius:");
            double rad = sc.nextDouble();
            Circle c = new Circle(rad);
            c.computeArea();
            System.out.println("Area of circle is " + String.format("%.2f", c.getArea()));
        } else if (n == 2) {
            System.out.println("Enter the length and breadth:");
            double len = sc.nextDouble();
            double wid = sc.nextDouble();
            Rectangle r = new Rectangle(len, wid);
            r.computeArea();
            System.out.println("Area of rectangle is " + String.format("%.2f", r.getArea()));
        } else if (n == 3) {
            System.out.println("Enter the base and height:");
            double b = sc.nextDouble();
            double hei = sc.nextDouble();
            Triangle t = new Triangle(b, hei);
            t.computeArea();
            System.out.println("Area of triangle is " + String.format("%.2f", t.getArea()));
        } else {
            System.out.println("Invalid choice");
        }
    }
}
