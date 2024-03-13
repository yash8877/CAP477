import java.util.Map;
import java.util.LinkedHashMap;
public class MakeMyTrip implements HotelTariff{
    public static Map<String, Map<String, Long>> getHotels() {
		Map<String, Map<String, Long>> hotelMap = new LinkedHashMap<String, Map<String, Long>>();
    
	        Map<String, Long> hotelCosts1 = new LinkedHashMap<String, Long>();
	    	hotelCosts1.put("Blue Stones", (long) 33000);
		hotelCosts1.put("Mahal", (long) 28000);
		hotelCosts1.put("Taj", (long) 20000);
        
		
		Map<String, Long> hotelCosts2 = new LinkedHashMap<String, Long>();
		hotelCosts2.put("Woods Park", (long) 27000);
		hotelCosts2.put("Union venue", (long) 16000);
		hotelCosts2.put("Celebrity", (long) 43000);
		
	        Map<String, Long> hotelCosts3 = new LinkedHashMap<String, Long>();
	    	hotelCosts3.put("Ecludia", (long) 80000);
		hotelCosts3.put("Angel Park", (long) 20000);
		hotelCosts3.put("Le Meridian", (long) 15000);

	        hotelMap.put("Mumbai", hotelCosts1);
		hotelMap.put("Coimbatore", hotelCosts2);
		hotelMap.put("Hyderabad", hotelCosts3);

		return hotelMap;
	}

	public void showTariff(String city) {
		Map<String, Map<String, Long>> hotelMap=getHotels();
		if(hotelMap.containsKey(city)){
			Map <String, Long> hotels=hotelMap.get(city);
			hotels.forEach((hotel, cost)-> System.out.println(hotel+"-"+cost));
			} else{
				System.out.println("No hotels are available for this city");
			}
	}
	
	public void displayCities(){
		System.out.println("Cities:");
		getHotels().keySet().forEach(System.out::println);
	}
}
