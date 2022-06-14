package core.masterdata.module.services;

import core.masterdata.module.repositories.PersonRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;


@Singleton
public class PersonService {


    public String find(Long pId){
        //Optional<Person> person = personRepository.findById(pId);
        return "ehi";
    }
}
