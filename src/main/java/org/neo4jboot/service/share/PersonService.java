package org.neo4jboot.service.share;

import org.neo4jboot.repository.share.PersonRepository;
import org.neo4jboot.domain.share.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Service;

/**
 * Created by hugh on 1/26/16.
 */

@Service
public class PersonService extends BaseService<Person>{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public GraphRepository<Person> getRepository() {
        return personRepository;
    }
}
