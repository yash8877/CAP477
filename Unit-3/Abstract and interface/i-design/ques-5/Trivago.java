import java.util.LinkedHashMap;
import java.util.Map;
public class Trivago implements HotelTariff {
    public static Map<String, Map<String, Long>> getHotels() {
		Map<String, Map<String, Long>> hotelMap = new LinkedHashMap<String, Map<String, Long>>();

		Map<String, Long> hotelCosts1 = new LinkedHashMap<String, Long>();
		hotelCosts1.put("Darby", (long) 30000);
		hotelCosts1.put("Nayara Springs", (long) 80000);
	        hotelCosts1.put("La Fortuna", (long) 20000);

		Map<String, Long> hotelCosts2 = new LinkedHashMap<String, Long>();
		hotelCosts2.put("Kangaroo Island", (long) 200000);
		hotelCosts2.put("Rhode Island", (long) 145000);
		hotelCosts2.put("Ocean House", (long) 324000);

		Map<String, Long> hotelCosts3 = new LinkedHashMap<String, Long>();
		hotelCosts3.put("Londolozi Game Reserve", (long) 90000);
		hotelCosts3.put("Kruger National Park Area", (long) 232000);
		hotelCosts3.put("The Langham", (long) 100000);

		hotelMap.put("Costa Rica", hotelCosts1);
		hotelMap.put("Australia", hotelCosts2);
		hotelMap.put("Florida", hotelCosts3);

		return hotelMap;
	}

	public void showTariff(String city) {  	
		Map<String, Map<String, Long>> hotelMap=getHotels();
		if(hotelMap.containsKey(city)){
			Map<String, Long> hotels=hotelMap.get(city);
			hotels.forEach((hotel, cost)->System.out.println(hotel+"-"+cost));
		} else{
			System.out.println("No hotels are available for this city");
		}
	}
	public void displayCities(){
		System.out.println("Cities:");
		getHotels().keySet().forEach(System.out::println);
	}
}
