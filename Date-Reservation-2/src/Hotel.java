import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Reservation> reservationList;

    public Hotel() {
        this.reservationList = new ArrayList<>();
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public String addReservation(Reservation reservation) {
        if (reservation.getNumOfNights() <= 0) {
            return "Sorry, " + reservation.getGuestName() + ". Your reservation is invalid and cannot be added.";
        }

        reservationList.add(reservation);

        Reservation lastReservation = reservationList.get(reservationList.size() - 1);
        String checkoutDateTime = lastReservation.getCheckIn()
                .plusDays(lastReservation.getNumOfNights())
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));

        return "Welcome, " + reservation.getGuestName() + ". Your reservation is set! Check-out is at " + checkoutDateTime + ".";
    }

    public boolean removeReservation(String name) {
        reservationList.remove(name);
        return true;
    }
}
