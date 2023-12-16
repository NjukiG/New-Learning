import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {


    public static Callable<Integer> getCallableInteger() {
        // your code here

        return () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enyter a number to be called: ");
            int num = scanner.nextInt();

//            System.out.println("YOu enterd the  number: " + num);
            return num;
        };
    }

    public static void main(String[] args) throws Exception {
        Callable<Integer> myInteger = getCallableInteger();

        System.out.println("YOu enterd the  number: " + myInteger.call());


    }
}