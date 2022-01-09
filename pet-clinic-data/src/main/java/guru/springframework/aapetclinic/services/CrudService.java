package guru.springframework.aapetclinic.services;

import java.util.Set;

// this is implemented like CrudRepository<> just to be simple we did this
// T: Type, ID: id
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
