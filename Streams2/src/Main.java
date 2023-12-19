import java.util.*;
import java.util.function.Function;

import static java.util.Arrays.compare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<GasStation> gasStations = List.of(
                new GasStation("SuperSpeedy Gas", 3.79),
                new GasStation("Quickmart Gas", 3.95),
                new GasStation("GasNGo", 3.89));

//        //Call the stream min method passing a Comparator to find the lowest price
//        gasStations.stream()
//                .min(Comparator.comparing(GasStation::getPricePerGallon))
//                .ifPresent(minStation -> System.out.println(minStation.getName() + " has the lowest price of $ " + minStation.getPricePerGallon()));
//
//        //Print the gas station name and lowest price if a value exists

        //Prompt the user to enter a price limit
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your price limit per gallon?");
        double limit = scanner.nextDouble();

        //Filter and print gas stations with price per gallon <= limit

        gasStations.stream().filter(gasStation -> gasStation.getPricePerGallon() <= limit).forEach(System.out::println);



    }
}