package core.masterdata.module.controllers;

import core.masterdata.module.entities.Person;
import core.masterdata.module.repositories.BookRepository;
import core.masterdata.module.repositories.PersonRepository;
import core.masterdata.module.services.PersonService;
import io.micronaut.context.ApplicationContext;
import io.micronaut.core.version.annotation.Version;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.Optional;

import static core.masterdata.module.constants.EntitiesConstants.BASE_URL;

@Controller(BASE_URL + "/person/")
@Version("1")
public class PersonController {

    @Inject
    PersonService personService;

    @Inject
    BookRepository bookRepository;

    @Get("find")
    public String getPerson(Long pId){

        Optional<Person> person;
        System.out.println(personService.find(pId));
        System.out.println(pId);
        return "ciao";
        //return (person.getName());
    }
}
