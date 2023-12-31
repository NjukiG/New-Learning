package org.example.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable=false)
    private String title;

    @Column(unique=true, nullable=false)
    private String isbn;

    @Column(name="publication_date")
    private LocalDate publicationDate;

    private int pages;

    @Column(columnDefinition = "integer default 1")
    private int edition = 1;


    @ManyToOne
    private Publisher publisher;   // foreign key publisher_id


    @ManyToMany(mappedBy="books")
    private Set<Author> authors = new HashSet<>();


    //getters, setters, toString

    public void addAuthor(Author author) {
        authors.add(author);
        author.addBook(this); //update the owning side
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationDate=" + publicationDate +
                ", pages=" + pages +
                ", edition=" + edition +
                '}';
    }
}