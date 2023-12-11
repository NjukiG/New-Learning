import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence for me to count the characters:\n");
        String userInput = scanner.nextLine();

        System.out.println("Character : Number of times a character appeared\n");

        Map<Character, Integer> characters = countCharacters(userInput);
        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    public static Map<Character, Integer> countCharacters(String message) {
        // Your code here
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : message.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }
}