public class MoviesMain {
    public static void  main(String[] args){
        System.out.println("We are in movies!");

        Movies avengers = new Movies("Avengers End Game", "Action", 8.5);

        avengers.printDetails();
    }
}
