package pl.wat.grafql.Book;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;
import pl.wat.grafql.Author.Author;
import pl.wat.grafql.Author.AuthorRepository;


@Component
public class BookMutation implements GraphQLMutationResolver {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookMutation(BookRepository bookRepository, AuthorRepository authorRepository){
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Book addBook(String title, int pageCount, Integer authorId){
        return bookRepository.save(new Book(title, pageCount, authorRepository.getOne(authorId)));
    }
}
