import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the airport:");
        String name = scanner.nextLine().trim();

        System.out.println("Enter the city name:");
        String cityName = scanner.nextLine().trim();

        System.out.println("Enter the country code:");
        String countryCode = scanner.nextLine().trim();

        writeAirportDetailsToFile(name, cityName, countryCode);
        System.out.println("Airport details have been recorded in airport.csv");
    }

    private static void writeAirportDetailsToFile(String name, String cityName, String countryCode) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("airport.csv"))) {
            writer.println(name + "," + cityName + "," + countryCode);
        } catch (IOException e) {
            System.err.println("Error writing to airport.csv: " + e.getMessage());
        }
    }
}
