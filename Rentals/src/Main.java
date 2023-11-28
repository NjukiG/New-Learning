// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java apartments!");

        RentalUnit unit1 = new RentalUnit("Roysambu", 20000, true, 12);

        System.out.println(unit1.getAddress());
        System.out.println(unit1.getMinimumMonths());
        System.out.println(unit1.getMonthlyRate());
        System.out.println(unit1.isPetAllowed());

    }
}