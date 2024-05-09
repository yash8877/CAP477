import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values for length, width and depth : ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int depth = scanner.nextInt();

        Box<Integer, Integer, Integer> box = new Box<>(length, width, depth);
        box.print();

        scanner.close();
    }
}

