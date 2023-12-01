import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Swimmable> swimmingAnimals = new ArrayList<>();

        swimmingAnimals.add(new Duck("Donald"));
        swimmingAnimals.add(new Fish("Shark"));
        swimmingAnimals.add(new Turtle("Green Sea Turtle"));
        swimmingAnimals.add(new SubMarine("Destroyer"));



        for (Swimmable swimmer : swimmingAnimals) {
            swimmer.swim();
        }

    }
}