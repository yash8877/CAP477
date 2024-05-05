import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class HallBooking {
	//Your code here
	private Hall hall;
	private Event event;
	private Date startDate;
	private Date endDate;
	private Double price;

	public HallBooking(Hall hall, Event event, String startDate, String endDate,String price)  {
		this.hall = hall;
		this.event = event;
		try {

		SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yyyy");
		this.startDate = sf.parse(startDate);
		this.endDate = sf.parse(endDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		this.price = Double.parseDouble(price);
	}

	public String getName() {
		return this.hall.getName();
	}
	
}