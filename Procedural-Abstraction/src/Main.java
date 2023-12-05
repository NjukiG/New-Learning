import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Assume we are going to a fair!

        System.out.println("Let's go to the fair!");

        // Section One - Uncomment this out when you get to this section
        rideSwings();
        rideFerrisWheel(2);

//         Section Two - Uncomment this out when you get to this section
        playGame();

        // Section Three - Uncomment this out when you get to this section
        double totalPrice = buyFunnelCake();
        System.out.printf("Spent $%.2f on a funnel cake!\n", totalPrice);
        totalPrice += buyCornDogs(3);
        totalPrice += buyCornDogs(0);
        totalPrice += buyCornDogs(10);
        System.out.printf("Spent a total of $%.2f on fair food!", totalPrice);

    }

    /**
     * Write the rideSwings method
     * Print a message about riding the swings
     */

    public static void rideSwings() {
        System.out.println("Whee! We're on the swings!");
    }

    /**
     * Write the rideFerrisWheel method
     *
     * @param times : int - number of times the Ferris Wheel is ridden
     */

    public static void rideFerrisWheel(int times) {
        while (times > 0) {
            System.out.println("We're riding the ferris wheel!");
            times -= 1;
        }
    }

    /**
     * Write the playGame method
     * Print a message to indicate if we won or lost the game
     */

    public static void playGame() {
        Random random = new Random();
        boolean randomBoolean = random.nextBoolean();

        if (randomBoolean) {
            System.out.println("We are the champions!");
        } else {
            System.out.println("We lost - oh well. Better luck next time.");
        }
    }

    /**
     * Write the buyFunnelCake method
     * @return dou;ble - cost of a funnel cake
     */
    /**
     * Write the buyCornDogs method
     * @param numberOfCornDogs : int - the number of corn dogs to purchase
     * @return double - total cost of the number of corn dogs purchased
     */

    public static double buyFunnelCake(){
        return 5.50;
    }

    public static double buyCornDogs(int numberOfCornDogs){

        return numberOfCornDogs * 2.25;
    }
}