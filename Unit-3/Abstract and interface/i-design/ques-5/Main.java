import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    		//Your code here
			Scanner s=new Scanner(System.in);
			System.out.println("Choose the guide");
			System.out.println("1)Make My Trip\n2)Trivago\n3)Clear Trip");
			int choice=s.nextInt();
			HotelTariff hotelGuide= null;
			switch(choice){
				case 1:
				hotelGuide=new MakeMyTrip();
				break;
				case 2:
				hotelGuide=new Trivago();
				break;
				case 3:
				hotelGuide=new ClearTrip();
				break;
				default:
				System.out.println("Invalid Choice");
			}
			if(hotelGuide!=null){
			hotelGuide.displayCities();
			
			System.out.println("Enter city where you want to search for hotels:");
			s.nextLine();
			String city=s.nextLine();
			hotelGuide.showTariff(city);
			}
	}
}
