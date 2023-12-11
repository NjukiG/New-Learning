import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks(){
        return books;
    }

    public  void addBook(Book book) {
        // Write code here
        boolean add = books.add(book);
        System.out.println(book + "Added");
    }

    public boolean displayBooks() {
        // Write code here
        for(Book book : books){
            System.out.println(book.getTitle());
        }
        return false;
    }

    public Book findBook(String title) {
        // Write code here
        for(Book book: books){
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
