package org.neo4jboot.controller.share;

import org.neo4jboot.domain.share.Person;
import org.neo4jboot.service.share.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hugh on 1/26/16.
 */

@RequestMapping(value = "/person")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public Iterable<Person> list() {
        return personService.findAll();
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public String test(){
        return "test";
    }


}
