package lukaszhajdun.example.spring5WebApp.bootstrap;

import lukaszhajdun.example.spring5WebApp.model.Author;
import lukaszhajdun.example.spring5WebApp.model.Book;
import lukaszhajdun.example.spring5WebApp.repositories.AuthorRepository;
import lukaszhajdun.example.spring5WebApp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Kroolik on 2017-11-01.
 */

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }


    private void initData(){

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domein Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book ("J2EE Development without EJB", "2345", "Worx");
        rod.getBooks().add(noEJB);
        
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }


}
