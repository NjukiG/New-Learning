// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner to use

        Scanner prompt = new Scanner(System.in);

        System.out.println("Assume you run a market." +
                " We want to add a fruit, a quantity, and how much that fruit will cost.");
        System.out.println("For example: 5 apples cost $4.25.");
        System.out.println();

        try{
            // Prompt the user for a String value
            System.out.println("Please enter a String to represent the fruit you want to add to the market:");
            String fruit = prompt.nextLine();

            // Prompt the user for an integer value
            System.out.println("Please enter the quantity of " + fruit + " you'd like:");
            int quantity = prompt.nextInt();

            // Prompt the user for a double value
            System.out.println("Please enter the price of how much " + quantity + " " + fruit + " will cost:");
            double price = prompt.nextDouble();

            System.out.println(quantity + " " + fruit + " costs $" + price);
        }catch (InputMismatchException e){
            System.out.println("Your inputs are wrong!");
        }finally {

            System.out.println("Proceed to the counter to pay!");
        }
    }
}