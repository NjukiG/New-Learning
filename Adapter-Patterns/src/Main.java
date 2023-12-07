// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Aspen aspen = new Aspen();
        Pine pine = new Pine();
        Redwood redwood = new Redwood();

        MeterHeight aspenInMeters = new HeightAdapter(aspen);
        System.out.println("The height of an aspen tree in meters is " + aspenInMeters.getHeightInMetres());
        MeterHeight pineInMeters = new HeightAdapter(pine);
        System.out.println("The height of an pine tree in meters is " + pineInMeters.getHeightInMetres());
        MeterHeight redwoodInMeters = new HeightAdapter(redwood);
        System.out.println("The height of an redwood tree in meters is " + redwoodInMeters.getHeightInMetres());
    }
}