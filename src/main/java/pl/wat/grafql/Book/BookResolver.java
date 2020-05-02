package pl.wat.grafql.Book;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.wat.grafql.Author.Author;
import pl.wat.grafql.Author.AuthorRepository;

import java.util.List;

@Component
public class BookResolver implements GraphQLResolver<Book>{

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
    return authorRepository.findById(book.getAuthor().getId()).orElseThrow(null);
    }

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

}
