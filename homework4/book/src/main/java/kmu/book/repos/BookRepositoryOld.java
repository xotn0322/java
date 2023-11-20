package kmu.book.repos;

import kmu.book.Models.Book;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryOld {
    //create
    //retrieve
    static List<Book> books = new ArrayList<>();

    public BookRepositoryOld() {
        LoadBooks();
    }
    static void LoadBooks() {
        /*books.add(new Book(1, "Java for dummies"));
        books.add(new Book(2, "Modern design patterns"));
        books.add(new Book(3, "Web applications using Java"));*/
    }
    public List<Book> GetAllBooks() {
        if (books.isEmpty()) {
            LoadBooks();
        }

        return books;
    }
    public Book GetBook(@PathVariable int id) {
        return books.get(id-1);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> search(String term) {
        List<Book> books1 = books.stream().filter(book -> book.getTitle().contains(term)).toList();
        return books1;
    }
    //update
}
