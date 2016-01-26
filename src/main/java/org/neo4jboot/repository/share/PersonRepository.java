package org.neo4jboot.repository.share;

import org.neo4jboot.domain.share.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by hugh on 1/26/16.
 */

public interface PersonRepository extends GraphRepository<Person> {
}
