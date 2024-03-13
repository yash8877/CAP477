import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source city:");
        String sourceCity = scanner.nextLine();

        System.out.println("Enter the destination city:");
        String destinationCity = scanner.nextLine();

        System.out.println("Enter the flight\n1.Air India\n2.Indigo");
        int airlineType = scanner.nextInt();

        AirFare airFare;

        if (airlineType == 1) {
            airFare = new AirIndia();
        } else if (airlineType == 2) {
            airFare = new Indigo();
        } else {
            System.out.println("Invalid airline type.");
            scanner.close();
            return;
        }

        Double fare = airFare.showFare(sourceCity, destinationCity);

        if (fare != null) {
            System.out.println("The fare is " + fare);
        }

        scanner.close();
	}
}
