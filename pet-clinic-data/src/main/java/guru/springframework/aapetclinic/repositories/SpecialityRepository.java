package guru.springframework.aapetclinic.repositories;

import guru.springframework.aapetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
