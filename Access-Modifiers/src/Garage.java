import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<String> cars;

    private String garageName;

    public Garage(String garageName){
        this.garageName = garageName;
    }

    public void setCars(List cars) {
        this.cars = cars;
    }

    public List getCars() {
        return cars;
    }


    @Override
    public String toString(){
        return garageName;
    }


}
