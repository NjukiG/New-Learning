import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars;
    private String garageName;

    public Garage(String garageName){
        this.garageName = garageName;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public List<Car> listCars(){
        return new ArrayList<>(cars);
    }

    @Override
    public String toString(){
        return garageName;
    }
}