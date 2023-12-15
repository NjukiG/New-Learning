import java.util.HashSet;
import java.util.Set;

public class Airport {

    private String airportName;
    private String location;
    private Set<City> destinations;

    public Airport(String airportName, String location){
        this.airportName = airportName;
        this.location = location;
        this.destinations = new HashSet<>();
    }

    public void addCity(City cityname){
        destinations.add(cityname);
    }

    public String getAirportName() {
        return airportName;
    }

    public String getLocation() {
        return location;
    }

    public Set<City> getDestinations() {
        return destinations;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDestinations(Set<City> destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName + '\'' +
                ", location='" + location + '\'' +
                ", destinations=" + destinations +
                '}';
    }
}
