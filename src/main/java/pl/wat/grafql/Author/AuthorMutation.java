package pl.wat.grafql.Author;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutation implements GraphQLMutationResolver {
    private AuthorRepository authorRepository;

    public AuthorMutation(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public Author addAuthor(String firstName, String lastName){
        return authorRepository.save(new Author(firstName, lastName));
    }
}
