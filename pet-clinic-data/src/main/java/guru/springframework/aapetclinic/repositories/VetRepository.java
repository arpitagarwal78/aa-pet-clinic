package guru.springframework.aapetclinic.repositories;

import guru.springframework.aapetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
