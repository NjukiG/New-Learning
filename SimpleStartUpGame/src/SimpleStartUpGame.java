import java.sql.SQLOutput;

import static java.lang.Math.random;

public class SimpleStartUpGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleStartUp tikkytok = new SimpleStartUp();

        int randomNum = (int) (random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        tikkytok.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("Enter a number: ");

            String result = tikkytok.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("Killed the startup")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }

        }

    }
}