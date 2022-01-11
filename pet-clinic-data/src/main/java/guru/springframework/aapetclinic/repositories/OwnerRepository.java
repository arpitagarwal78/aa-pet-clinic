package guru.springframework.aapetclinic.repositories;

import guru.springframework.aapetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    // we can even use JpaRepository for more methods that internally extends CrudRepository
    // for now we have general needs
}
