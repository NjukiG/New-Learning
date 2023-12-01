import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the restaurant! What would you like for breakfast?");
        System.out.println("1. Eggs and Bacon");
        System.out.println("2. Oatmeal and Mixed Berries");
        System.out.println("3. Pancakes");

        try {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enjoy your eggs and bacon!");
                    break;
                case 2:
                    System.out.println("Enjoy your oatmeal and mixed berries!");
                    break;
                case 3:
                    System.out.println("Enjoy your pancakes!");
                    break;
                default:
                    System.out.println("Not a menu option.");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input");
        }
    }
}