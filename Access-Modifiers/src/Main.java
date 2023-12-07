import java.nio.channels.GatheringByteChannel;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Garage ngaraGarage = new Garage("Ngara-Garage");

        Car beamer = new Car("Beamer");
        Car merc = new Car("S550");
        Car toyota = new Car("Toyota");
        Car mazda = new Car("Mazda");

        ngaraGarage.addCar(beamer);
        ngaraGarage.addCar(merc);
        ngaraGarage.addCar(toyota);
        ngaraGarage.addCar(mazda);

        System.out.println(ngaraGarage.listCars());

        ngaraGarage.removeCar(toyota);

        List<Car> carsInMyYard = ngaraGarage.listCars();

        for (Car car : carsInMyYard) {
            System.out.println(car);
        }


    }
}