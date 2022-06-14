package core.masterdata.module.repositories;

import core.masterdata.module.entities.Book;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
