import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AirportReservationDriver {

    private List<Airport> airports;
    private List<Reservation> reservations;

    public AirportReservationDriver() {
        this.airports = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addAirport() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's build an airport, shall we?");
        System.out.println("Kindly enter the name of an airport: ");
        String airportName = scanner.nextLine();
        System.out.println("Enter the location of the airport: ");
        String airportLocation = scanner.nextLine();

        Airport airport = new Airport(airportName, airportLocation);

        System.out.println("How many destinations can be travelled to from this airpirt?");
        int numOfDestinations = scanner.nextInt();



        for (int i = 0; i <= numOfDestinations; i++) {
            System.out.println("Add a destination name: ");
            String destinationCity = scanner.nextLine();
            airport.addCity(new City(destinationCity));
        }

        airports.add(airport);
        System.out.println("A new airport with name: " + airport.getAirportName() + ", has been added.");
    }

    public void addReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's create a reservation for a pasenger!");
        System.out.println("Whats the name of your passenger?");
        String reservationName = scanner.nextLine();  // TObe used to create the reservation

        System.out.println("These are the airports we have, you can travel from.");

        for(int i = 0; i < airports.size();i++){
            System.out.println((i + 1) + ">>> " + airports.get(i).getAirportName());
        }

        System.out.println("Enter the airport NUMBER your customer intends to travel from.");
        int airportNum = scanner.nextInt();
        scanner.nextLine();

        Airport selectedAirport = airports.get(airportNum - 1);   // TObe used to create the reservation

        System.out.println("These are the cities the customer can travel to from the selected airport, " + selectedAirport.getAirportName());
        for(City city : selectedAirport.getDestinations()){
            System.out.println(city.getCityName());
        }

        System.out.println("Enter the name of the city the customer will be travelling to. ");
        String destinationCity = scanner.nextLine();   // TObe used to create the reservation


        City destination = null;
        for(City city : selectedAirport.getDestinations()){
            if(city.getCityName().equalsIgnoreCase(destinationCity)){
                destination= city;
                break;
            }
        }

        if(destination != null){
            Reservation reservation = new Reservation(reservationName, selectedAirport.getAirportName(), destination);
            reservation.createReservation();
            reservations.add(reservation);
        }else {
            System.out.println("Invalid destination city. Reservation not created.");
        }



    }

    public void cancelReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of passenger you'd like to cancel");

        String passengerName = scanner.nextLine();

        Iterator<Reservation> iterator = reservations.iterator();
        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();
            if (reservation.getPassengerName().equalsIgnoreCase(passengerName)) {
                reservation.cancelReservation();
                iterator.remove();
                return;
            }
        }

        System.out.println("No reservation found for passenger: " + passengerName);
    }

    public static void main(String[] args) {
        AirportReservationDriver driver = new AirportReservationDriver();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ Airport Reservation System ------");
            System.out.println("1. Add Airport");
            System.out.println("2. Create Reservation");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    driver.addAirport();
                    break;
                case 2:
                    driver.addReservation();
                    break;
                case 3:
                    driver.cancelReservation();
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("That's not a correct menu choice. Enter the menu numbers listed.");
            }
        }

    }
}