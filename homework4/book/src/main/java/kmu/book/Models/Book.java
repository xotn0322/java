package kmu.book.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Books")
public class Book {
    @Id
    String id;
    public String author;
    public String country;
    public String imageLink;
    public String language;
    public String link;
    public int pages;
    public String title;
    public int year;
}