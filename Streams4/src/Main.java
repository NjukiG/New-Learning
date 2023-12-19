import java.util.Scanner;

public class Main {
    public static int sumOfDivisors(int start, int end, int a, int b) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % a == 0 || i % b == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your start number");
        int start = scanner.nextInt();
        System.out.println("Enter your end number");
        int end = scanner.nextInt();
        System.out.println("Enter your first divisor number");
        int a = scanner.nextInt();
        System.out.println("Enter your second divisor number");
        int b = scanner.nextInt();

        System.out.println(sumOfDivisors(start, end, a, b));
    }
}