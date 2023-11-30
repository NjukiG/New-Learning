import java.util.Random;

public class Coin implements Flippable {

    @Override
    public void flip() {
        String[] arr = {"Heads", "Tails"};
        Random random = new Random();
        int select = random.nextInt(arr.length);

        System.out.println(arr[select]);
    }
}
