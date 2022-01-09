package guru.springframework.aapetclinic.services;

import guru.springframework.aapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
