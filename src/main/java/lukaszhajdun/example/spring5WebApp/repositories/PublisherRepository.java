package lukaszhajdun.example.spring5WebApp.repositories;

import lukaszhajdun.example.spring5WebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kroolik on 2017-11-01.
 */

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
