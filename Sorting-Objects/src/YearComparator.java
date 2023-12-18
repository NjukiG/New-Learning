import java.util.Comparator;

public class YearComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {

        if (o1.getReleaseYear() > o2.getReleaseYear()) return 1;
        else return -1;
    }
}
