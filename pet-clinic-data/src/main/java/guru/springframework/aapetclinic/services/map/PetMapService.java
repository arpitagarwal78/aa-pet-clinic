package guru.springframework.aapetclinic.services.map;

import guru.springframework.aapetclinic.model.Pet;
import guru.springframework.aapetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long>
        implements PetService {

    @Override
    public Set<Pet> findAll() {
        // super will point to AbstractMapService class implementation
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
