// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear;
        while (currentYear < targetYear) {
            int yearsPassed = currentYear - startingYear;

            if(yearsPassed == 1){
                System.out.println(yearsPassed + " year has passed");

            }else{
                System.out.println(yearsPassed + " years have passed");

            }
            // conditional logic based on the current year
            currentYear++;
        }
    }
}