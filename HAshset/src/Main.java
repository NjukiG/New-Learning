import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GlobalDirectory worldCities = new GlobalDirectory();
//        worldCities.addCity("Nairobi");
        int choiceNum = -1;

        do {
            printMenu();

            choiceNum = getChoice();
            switch (choiceNum) {
                case 0:
                    System.out.println("Existing. Goodbye!");
                    break;
                case 1:
                    addNewCity(worldCities);
                    break;
                case 2:
                    showAllCities(worldCities);
                    break;
                default:
                    System.out.println("Hello thetre");
            }
        } while (choiceNum != 0);

    }

    public static void printMenu() {
        System.out.println("Welcome to the Global Directory! What would you like to do?");
        System.out.println("0. Exit");
        System.out.println("1. Add a City to the Directory");
        System.out.println("2. Show the Cities in the Directory");
        System.out.println();
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice on menu:");
        return scanner.nextInt();
    }

    public static void addNewCity(GlobalDirectory globalDirectory) {
        System.out.println("ENter the name of a city you would like to add:");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        globalDirectory.addCity(city);
    }

    public static void showAllCities(GlobalDirectory globalDirectory) {
        Set<String> allCities = globalDirectory.getCities();

        for (String city : allCities) {
            System.out.println(city);
        }
    }
}