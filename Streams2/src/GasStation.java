public class GasStation {
    private String name;
    private double pricePerGallon;

    public GasStation(String name, double pricePerGallon) {
        this.name = name;
        this.pricePerGallon = pricePerGallon;
    }

    public String getName() {
        return name;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "name='" + name + '\'' +
                ", pricePerGallon=" + pricePerGallon +
                '}';
    }
}