package guru.springframework.aapetclinic.repositories;

import guru.springframework.aapetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
