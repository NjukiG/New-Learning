
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hotel serena = new Hotel();
        Reservation testReservation1 = new Reservation("April Ludgate", "10/01/2022 10:00", 1);
        System.out.println(serena.addReservation(testReservation1));

        System.out.println(serena.getReservations().isEmpty());
        System.out.println(serena.getReservations().size());

        Reservation testReservation2 = new Reservation("Andy Dwyer", "09/30/2022 12:15", 5);
        System.out.println(serena.addReservation(testReservation2));

        System.out.println(serena.getReservations().isEmpty());
        System.out.println(serena.getReservations().size());

        Reservation testReservation3 = new Reservation("Jerry Gergich", "10/10/2022 11:45", 0);

        System.out.println(serena.addReservation(testReservation3));

        Reservation testReservation4 = new Reservation("Jerry Gergich", "10/10/2022 11:45", -2);

        System.out.println(serena.addReservation(testReservation4));
    }
}