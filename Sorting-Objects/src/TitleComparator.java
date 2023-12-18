import java.util.Comparator;

public class TitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {

        if(o1.getTitle().length() > o2.getTitle().length()){
            return 1;
        }else{
            return -1;
        }
    }
}
