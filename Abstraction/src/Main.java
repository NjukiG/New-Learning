// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void printAthleteInfo(Athlete athlete) {
        System.out.printf("Jersey# %d has rating of %d%n",
                athlete.getJerseyNumber(),
                athlete.getRating());
    }

    public static void main(String[] args) {

        FootballPlayer athlete1 = new FootballPlayer(22, 6);

        printAthleteInfo(athlete1);   //6 * 5 = 30

        FootballPlayer athlete2 = new FootballPlayer(57, 2);
        printAthleteInfo(athlete2);   //2 * 5 = 10

        HockeyPlayer athlete3 = new HockeyPlayer(22,5,3);
        printAthleteInfo(athlete3);   //5 * 4 - 3 * 2 = 14

        HockeyPlayer athlete4 = new HockeyPlayer(17,1);

        printAthleteInfo(athlete4);   //1 * 4 - 0 * 2 = 4

    }
}