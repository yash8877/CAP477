import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<Event> eventList=new ArrayList<>();
		ArrayList<Hall> hallList=new ArrayList<>();
		
		eventList.add(new Event("Book Fair","All books available","John","Exhibition"));
		eventList.add(new Event("Furniture Fair","Discount of 20%","Joe","Exhibition"));
		eventList.add(new Event("Magic show","Magic without Logic","Jack","Stage event"));
		
		hallList.add(new Hall("Sdf hall","123456",new Double(10000.0),"Jill"));
		hallList.add(new Hall("JKL hall","135790",new Double(25000.0),"James"));
		hallList.add(new Hall("TUV hall","246800",new Double(15000.0),"Jane"));
		
		//write your code here

		Scanner sc = new Scanner(System.in);

		ArrayList<HallBooking> hallbooking = new ArrayList<>();

		Hall hall = new Hall();
		Event event = new Event();
		
		char x = 'y';
		while(x == 'y') {
			System.out.println("Enter the booking details:");
			String details[] = sc.nextLine().split(",");
			try {
				Hall h = hall.hallpresent(hallList, details[0]);
				Event e = event.eventpresent(eventList, details[1]);
				
				HallBooking newbooking = new HallBooking(h, e, details[2], details[3]);
				HallBookingBO.validateHallBooking(hallbooking, newbooking);
				hallbooking.add(newbooking);
			}catch(HallNotAvailableException e) {
				System.out.println(e);
			}

			System.out.println("Do you want to continue?(y/n)");
			String c = sc.nextLine();
			x = c.charAt(0);

		}

		 System.out.println("The bookings entered are:");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Hall id", "Event id", "Event date", "Price");
        for(HallBooking h : hallbooking) {
            System.out.printf(h.toString());
        }

	}
}