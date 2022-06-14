package core.masterdata.module.repositories;

import core.masterdata.module.entities.Person;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
