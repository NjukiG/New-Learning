import java.util.Comparator;

public class PriceComparator implements Comparator<GasStation> {
    @Override
    public int compare(GasStation o1, GasStation o2) {
        if (o1.getPricePerGallon() > o2.getPricePerGallon()) {
            return 1;
        } else {
            return -1;
        }

    }
}
