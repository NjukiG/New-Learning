import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library nationalLib = new Library();

        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
          printMenu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addBookToLibrary(scanner, nationalLib);
                    break;
                case 2:
                    nationalLib.displayBooks();
                    break;
                case 3:
                    getBookFromLibrary(scanner, nationalLib);
                    break;
                case 0:
                    System.out.println("Hapa tuna-exit. Bye-bye!");
                    break;
                default:
                    System.out.println("Enter a valid choice from the 3 abovve");
            }
        } while (choice != 0);

    }

    public static void printMenu() {
        System.out.println("Welcome to the library! What would you like to do?");
        System.out.println("0. Exit");
        System.out.println("1. Add book to library");
        System.out.println("2. Show books in library");
        System.out.println("3. Get book from library");
        System.out.println();
    }

    private static void addBookToLibrary(Scanner scanner, Library library) {
        System.out.println("What is the title of the book?");
        String title = scanner.nextLine();

        System.out.println("What is the author of the book?");
        String author = scanner.nextLine();

        System.out.println("What is the genre of the book?");
        String genre = scanner.nextLine();

        System.out.println("How many pages is the book?");
        int numberOfPages = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Book newBook = new Book(title, author, genre, numberOfPages);
        library.addBook(newBook);

        System.out.println(title + " has been added to the library!");
    }

    private static void getBookFromLibrary(Scanner scanner, Library library) {
        System.out.println("What is the title of the book you are looking for?");
        String titleToFind = scanner.nextLine();

        Book foundBook = library.checkIfBookExists(titleToFind);

        if (foundBook != null) {
            System.out.println("We found the book titled " + foundBook.getTitle());
        } else {
            System.out.println("We could not find the book titled " + titleToFind);
        }
    }


}