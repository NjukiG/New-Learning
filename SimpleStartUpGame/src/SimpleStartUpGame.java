import java.sql.SQLOutput;

import static java.lang.Math.random;

public class SimpleStartUpGame {
    public static void main(String[] args) {
        // Declare a variable to track the number of guesses the user will make starting at zero.
        int numOfGuesses = 0;

        // Use the game helper class to get the users guess.
        GameHelper helper = new GameHelper();

        // Declare a new tartup object we are going to kill.
        SimpleStartUp tikkytok = new SimpleStartUp();

        // Declare a random number that we'll use toassign the locations. Import the Math util too.
        int randomNum = (int) (random() * 5);

        // Set up the locations we'll use. three in total.
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        // Give the startup its Locations.
        tikkytok.setLocationCells(locations);

        // Make a boolean value to track if the startup is still alive.

        boolean isAlive = true;

        // A while loop to check the guesses now.

        while(isAlive){

            int guess = helper.getUserInput("Enter a number: ");

            String result = tikkytok.checkYourself(guess);
            numOfGuesses++;

            if(result.equals("Killed the startup")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }

        }

    }
}