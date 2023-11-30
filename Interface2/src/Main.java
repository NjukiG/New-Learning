public class Main {
    public static void main(String[] args) {
        Flippable coin = new Coin();
        for (int i = 0; i < 5; i++) {
            coin.flip();
        }

        Flippable mattress = new Mattress();
        for (int i = 0; i < 5; i++) {
            mattress.flip();
        }
    }
}