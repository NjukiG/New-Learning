import java.util.Arrays;
import java.util.OptionalDouble;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] pricePerGallon = {3.50, 3.25, 4.64, 3.95};

        //Call the stream count method and print the number of values in the array

      long count = Arrays.stream(pricePerGallon).count();
        System.out.println("Price count: " +count);

        //Call the stream max method to get the maximum price
        double maxPrice = Arrays.stream(pricePerGallon).max().orElse(Double.NaN);


        //Print the highest price per gallon (if a maximum value exists)
        if(!Double.isNaN(maxPrice)){
            System.out.println("Highest price per gallon: " + maxPrice);
        }

    }
}