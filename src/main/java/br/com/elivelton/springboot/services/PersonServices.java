package br.com.elivelton.springboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.elivelton.springboot.model.Person;

@Service
public class PersonServices {
    
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    
    public Person create(Person person){
        
        logger.info("Creating person...");
        return person;

    }

    public Person update(Person person){

        logger.info("Updating person...");
        return person;

    }

    
    public Person delete(String id){

        logger.info("Deleting person...");
        Person person = findById(id);
        return person;

    }
    
    
    public Person findById (String id) {
        
        logger.info("Searching...");
        
        Person person = new Person();
        
        person.setId(counter.incrementAndGet());
        person.setFirstName("Jão");
        person.setLastName("Doe");
        person.setAddress("Somewhere");
        person.setGender("Male");
        
        return person;
    }
    
    public List<Person> findAll(){
        
        List<Person> persons = new ArrayList<>();
        
        for(int i = 0; i< 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }
    
    private Person mockPerson(int i) {
        
        logger.info("Findinfg all people...");
        
        Person person = new Person();
        
        person.setId(counter.incrementAndGet());
        person.setFirstName("Some");
        person.setLastName("Person" + i);
        person.setAddress("Somewhere");
        person.setGender("Male");
        return person;
    
    }

}
