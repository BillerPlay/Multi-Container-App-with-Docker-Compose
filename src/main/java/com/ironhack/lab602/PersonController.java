package com.ironhack.lab602;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService){
        this.personService=personService;
    }

    @GetMapping("/hello")
    public String hello(){
        String name = personService.getPersonById(1L);
        return "Hello, " + name;
    }
}
