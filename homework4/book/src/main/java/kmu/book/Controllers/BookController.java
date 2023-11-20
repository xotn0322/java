package kmu.book.Controllers;

import kmu.book.Models.Book;
import kmu.book.repos.BookRepository;
import kmu.book.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    BookRepository bookRepository;

    LibraryService libraryService = new LibraryService();

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }

    @GetMapping(path = "/books")
    public List<Book> GetAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping(path = "/books/{id}")
    public ResponseEntity<Book> GetBook(@PathVariable String id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping(path = "books/add")
    public List<Book> addBook(@RequestBody Book book) {
        bookRepository.save(book);
        return bookRepository.findAll();
    }

    /*@GetMapping(path = "books/search/{term}")
    public List<Book> searchBook(@PathVariable String term) {
        return bookRepository.findBy({title : "term"});
    }*/

    //get all students
    //get student(id)
    //add student(student)
    //delete student(id);
}
