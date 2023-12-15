public class Reservation {

    private String passengerName;
    private String passengerFrom;

    private City passengerTo;

    public Reservation(String passengerName, String passengerFrom, City passengerTo) {
        this.passengerName = passengerName;
        this.passengerFrom = passengerFrom;
        this.passengerTo = passengerTo;
    }

    public void createReservation() {
        System.out.println("Reservation created for " + passengerName + " travelling to " + passengerTo.getCityName() + " from " + passengerFrom);
    }

    public void cancelReservation() {
        System.out.println("Reservation for " + passengerName + " planned to travel to " + passengerTo.getCityName() + " has been cancelled.");
    }


    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerFrom() {
        return passengerFrom;
    }

    public City getPassengerTo() {
        return passengerTo;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setPassengerFrom(String passengerFrom) {
        this.passengerFrom = passengerFrom;
    }

    public void setPassengerTo(City passengerTo) {
        this.passengerTo = passengerTo;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "passengerName='" + passengerName + '\'' +
                ", passengerFrom='" + passengerFrom + '\'' +
                ", passengerTo='" + passengerTo + '\'' +
                '}';
    }
}
