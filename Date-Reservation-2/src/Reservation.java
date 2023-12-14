import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private String guestName;
    private LocalDateTime checkIn;
    private int numOfNights;

    public Reservation(String guestName, String checkIn, int numOfNights) {
        this.guestName = guestName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm");
        this.checkIn = LocalDateTime.parse(checkIn, formatter);
        this.numOfNights = numOfNights;
    }

    public String getGuestName() {
        return guestName;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "guestName='" + guestName + '\'' +
                ", checkIn=" + checkIn +
                ", numOfNights=" + numOfNights +
                '}';
    }

    public String formattedCheckInDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        return checkIn.format(formatter);
    }

}
