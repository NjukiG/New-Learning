import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (names.size() != 5) {
            System.out.println("Enter a name!");
            String name = scanner.nextLine();
            names.add(name);
        }


        System.out.println("You have entered the following names.");

        for (String item : names) {
            System.out.println(item);
        }


    }
}