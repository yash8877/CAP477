import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		//write your code here
		Scanner sc = new Scanner(System.in);

		try {
			BufferedReader bs = new BufferedReader(new FileReader("input.csv"));

			String name;
			char x = 'y';

			EventBO ebo = new EventBO();
			ArrayList<Event> events = ebo.readFile(bs);
			
			while(x == 'y') {
				System.out.println("Enter the name of the person whose events to be shown:");
				name = sc.nextLine();
				ArrayList<Event> selectedEvents = ebo.eventsByPerson(events, name);

				if(selectedEvents.isEmpty()) {
					System.out.println("The given person has no upcoming events");
				}else {

				System.out.printf("%-15s%-20s%-15s%-15s%-15s\n", "Name", "Detail", "Type", "Attendees Count", "Projected Expense");
				for(Event e : selectedEvents) {
					System.out.println(e.toString());
				}
				}


				System.out.println("Do you want to continue?(y/n)");
				x = sc.nextLine().charAt(0);


			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
