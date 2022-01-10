package guru.springframework.aapetclinic.services.map;

import guru.springframework.aapetclinic.model.Speciality;
import guru.springframework.aapetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long>
        implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        // super will point to AbstractMapService class implementation
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
