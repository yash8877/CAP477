import java.util.ArrayList;
class HallBookingBO {
    public static boolean validateHallBooking(ArrayList<HallBooking> bookingList, HallBooking booking) throws HallNotAvailableException {
        for (HallBooking existingBooking : bookingList) {
            if (existingBooking.getHall().getName().equals(booking.getHall().getName())
                    && existingBooking.getEventDate().equals(booking.getEventDate())) {
                throw new HallNotAvailableException("Hall Already Booked");
            }
        }
        return true;
    }
}
