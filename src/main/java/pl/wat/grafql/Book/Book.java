package pl.wat.grafql.Book;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import pl.wat.grafql.Author.Author;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private Integer pageCount;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(String title, Integer pageCount, Author author){
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
    }

}
