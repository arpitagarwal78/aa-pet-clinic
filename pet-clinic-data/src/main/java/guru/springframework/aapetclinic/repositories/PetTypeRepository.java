package guru.springframework.aapetclinic.repositories;

import guru.springframework.aapetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
