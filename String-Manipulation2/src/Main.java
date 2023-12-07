import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a sentence:");
        String input = scanner.nextLine();

        int numberOfEs = findE(input);

        if (numberOfEs > 0) {
            String noE = withoutE(input);
            System.out.println("The letter e appeared " + numberOfEs + " times.");
            System.out.println("Here is that sentence without the letter e: " + noE);

        } else {
            System.out.println("The letter e was not in the given sentence.");
        }
    }

    public static int findE(String input) {
        // Write your code here!
        input = input.toLowerCase();
        int totalEs = 0;
        for(int i =0; i < input.length();i++){
            if(input.charAt(i) == 'e'){
                totalEs++;
            }
        }
        return totalEs;
    }

    public static String withoutE(String input) {
        // Write your code here!
        input = input.toLowerCase();

        for(int i = 0; i < input.length();i++){
            if(input.charAt(i) == 'e'){
               input = input.replace('e', ' ');
            }
        }
        return input;

    }
}