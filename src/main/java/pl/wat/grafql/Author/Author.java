package pl.wat.grafql.Author;

import lombok.Data;
import pl.wat.grafql.Book.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "author")
    private Collection<Book> books;

    public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    }


}
