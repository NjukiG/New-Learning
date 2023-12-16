
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", false);      //does not like baths
        Dog fifi = new Dog("Fifi", true);           //likes baths
        Dog odie = new Dog("Odie", true);           //likes baths

        Thread snoopyEating = new Thread(() -> snoopy.eatTreats(3));
        Thread fifiEating = new Thread(() -> fifi.eatTreats(4));
        Thread odieEating = new Thread(() -> odie.eatTreats(5));
        Thread snoopyBathing = new Thread(() -> snoopy.takeBath());

        snoopyEating.start();
        fifiEating.start();
        odieEating.start();

        try {
            snoopyEating.join();
            snoopyBathing.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}