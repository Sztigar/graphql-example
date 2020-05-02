package pl.wat.grafql.Author;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorQuery implements GraphQLQueryResolver {

    private AuthorRepository authorRepository;

    public AuthorQuery(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
}
