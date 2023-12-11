import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book " + book.getTitle());
    }

    public void displayBooks(){
        for(Book book: books){
            System.out.println("Displaying " + book.getTitle());
        }
    }

    public Book checkIfBookExists(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
