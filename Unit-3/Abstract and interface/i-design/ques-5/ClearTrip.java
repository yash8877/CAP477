import java.util.LinkedHashMap;
import java.util.Map;
public class ClearTrip implements HotelTariff {
    public static Map<String, Map<String, Long>> getHotels() {
		Map<String, Map<String, Long>> hotelMap = new LinkedHashMap<String, Map<String, Long>>();

		Map<String, Long> hotelCosts1 = new LinkedHashMap<String, Long>();
		hotelCosts1.put("Tierra Patagonia Hotel", (long) 127000);
		hotelCosts1.put("Torres del Paine National Park", (long) 316000);
		hotelCosts1.put("Auberge du Soleil", (long) 433000);

		Map<String, Long> hotelCosts2 = new LinkedHashMap<String, Long>();
		hotelCosts2.put("Little Torch Key", (long) 130000);
		hotelCosts2.put("Lexington", (long) 582000);
		hotelCosts2.put("Inn at Hastings Park", (long) 453000);
        
	        Map<String, Long> hotelCosts3 = new LinkedHashMap<String, Long>();
	    	hotelCosts3.put("InterContinental Danang Sun Peninsula Resort", (long) 180000);
		hotelCosts3.put("Wilderness Safaris Little Kulala", (long) 450000);
		hotelCosts3.put("Sossusvlei", (long) 780000);
        
		hotelMap.put("California", hotelCosts1);
		hotelMap.put("Massachusetts", hotelCosts2);
	        hotelMap.put("Namibia", hotelCosts3);
		return hotelMap;

	}

	public void showTariff(String city) {
		Map<String, Map<String, Long>> hotelMap=getHotels();
		if(hotelMap.containsKey(city)){
			Map<String, Long> hotels=hotelMap.get(city);
			hotels.forEach((hotel,cost)->System.out.println(hotel+"-"+cost));
		} else{
			System.out.println("No hotels are available for this city");
		}
	}
	
	public void displayCities(){
		System.out.println("Cities:");
		getHotels().keySet().forEach(System.out::println);
	}
}
