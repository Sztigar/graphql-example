package pl.wat.grafql.Author;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wat.grafql.Book.Book;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private Collection<Book> books;

    public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    }


}
