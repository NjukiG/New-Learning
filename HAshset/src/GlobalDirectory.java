
import java.util.HashSet;
import java.util.Set;

public class GlobalDirectory {

    private Set<String> cities;

    public GlobalDirectory() {
        this.cities = new HashSet<>();
    }

    public boolean addCity(String city) {
        if (!cities.contains(city)) {
            cities.add(city);
            System.out.println(city + " has been added!");
            return true;
        } else {
            System.out.println("Oops - " + city + " is already in the set.");
            return false;
        }
    }

    public Set<String> getCities() {
        return cities;
    }
}
