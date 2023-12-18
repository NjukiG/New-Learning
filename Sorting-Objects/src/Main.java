import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("Thor, Love and Thunder", 2022, "Walt Disney Pictures"),
                new Movie("The Lord of the Rings: The Two Towers", 2002, "New Line Cinema"),
                new Movie("Top Gun: Maverick", 2022, "Paramount Pictures"),
                new Movie("Cars", 2006, "Walt Disney Pictures")};

        //Add your code here

        Arrays.sort(movies, new YearComparator());
        System.out.println("Sort movies by year of release: " + Arrays.toString(movies));


        Arrays.sort(movies, new TitleComparator());
        System.out.println("Sort movie by title: " + Arrays.toString(movies));
    }
}