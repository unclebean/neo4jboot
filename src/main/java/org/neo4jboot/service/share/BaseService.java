package org.neo4jboot.service.share;

import org.neo4jboot.domain.share.Entity;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by hugh on 1/26/16.
 */

public abstract class BaseService<T> {

    public Iterable<T> findAll(){
        return getRepository().findAll(0);
    }

    public T find(Long id){
        return getRepository().findOne(id, 1);
    }

    public void delete(Long id) {
        getRepository().delete(id);
    }

    public T createOrUpdate(T entity) {
        getRepository().save(entity, 1);
        return find(((Entity) entity).getId());
    }

    public abstract GraphRepository<T> getRepository();
}
