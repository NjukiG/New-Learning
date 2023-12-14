import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {

    // Finish implementing the class
    private String name;
    private LocalDateTime checkin;
    private int numberOfNights;

    public Reservation(String name, String checkin, int numberOfNights) {
        // Write the constructor code here
        this.name = name;
//        this.checkin = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm");
        this.numberOfNights = numberOfNights;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        this.checkin = LocalDateTime.parse(checkin, formatter);



    }

    // Accessor methods
    public String getGuestName() {
        return name;
    }

    public LocalDateTime getCheckInDateTime() {
        return checkin;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public String formattedCheckInDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        return checkin.format(formatter);
    }
}
