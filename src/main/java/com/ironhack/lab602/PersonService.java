package com.ironhack.lab602;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    public PersonService(PersonRepository personRepository){
        this.personRepository=personRepository;
    }
    public String getPersonById(Long id){
        return personRepository.findById(id)
                .map(Person::getName)
                .orElse(null);
    }
}
