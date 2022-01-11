package guru.springframework.aapetclinic.repositories;

import guru.springframework.aapetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
