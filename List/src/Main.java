
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library naiLib = new Library();
        Book java = new Book("Head First","Georgie", "Programming", 600);
        Book lawsOfPower = new Book("48 Laws of Power","RObert", "Phylosophy", 500);
        Book fifLaw = new Book("50th Law","50 Cent", "Phylosophy", 300);

        naiLib.addBook(java);
        naiLib.addBook(lawsOfPower);
        naiLib.addBook(fifLaw);

        System.out.println(naiLib.findBook("50th Law"));
        System.out.println(naiLib.displayBooks());

    }
}