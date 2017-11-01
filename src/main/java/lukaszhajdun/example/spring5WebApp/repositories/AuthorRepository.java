package lukaszhajdun.example.spring5WebApp.repositories;

import lukaszhajdun.example.spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kroolik on 2017-11-01.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
