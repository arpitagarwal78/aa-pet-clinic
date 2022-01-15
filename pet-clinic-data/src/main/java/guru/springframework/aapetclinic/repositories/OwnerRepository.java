package guru.springframework.aapetclinic.repositories;

import guru.springframework.aapetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    // we can even use JpaRepository for more methods that internally extends CrudRepository
    // for now we have general needs

    Owner findByLastName(String lastName); // automatically setup method

    List<Owner> findAllByLastNameLike(String lastName);
}
