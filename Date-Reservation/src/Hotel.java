import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Reservation> reservations;

    public Hotel() {
        this.reservations = new ArrayList<>();
    }

    public List<Reservation> getReservations() {
        // Write code here
//        return new ArrayList<>();
        return reservations;
    }


    public String addReservation(Reservation reservation) {
        // Write code here
        if(reservation.getNumberOfNights() <= 0){
            return "Sorry, " + reservation.getGuestName() + ". Your reservation is invalid and cannot be added.";
        }
        reservations.add(reservation);

        Reservation lastReservation = reservations.get(reservations.size() - 1);
        String checkoutDateTime = lastReservation.getCheckInDateTime()
                .plusDays(lastReservation.getNumberOfNights())
                .format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));

        return "Welcome, " + reservation.getGuestName() + ". Your reservation is set! Check-out is at " + checkoutDateTime + ".";
    }
}