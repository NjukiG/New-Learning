
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Movies {
    private String title;
    private String genre;
    private double rating;

    public Movies(String movieTitle, String movieGenre, double movieRating){
        this.title = movieTitle;
        this.genre = movieGenre;
        this.rating = movieRating;
    }

    public void printDetails(){
        System.out.println(title + ", is an "+ genre + " movie rated " + rating + ".");
    }

}