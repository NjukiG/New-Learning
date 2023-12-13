import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("ENter a number we shall divide: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter another number we will divide by: ");
            int num2 = scanner.nextInt();

            System.out.println("result is " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero, bro!");
        } catch (Exception e) {
            System.out.println("Use only integers or numbers");
        } finally {
            System.out.println("Try-Catch block is done");
        }
    }
}