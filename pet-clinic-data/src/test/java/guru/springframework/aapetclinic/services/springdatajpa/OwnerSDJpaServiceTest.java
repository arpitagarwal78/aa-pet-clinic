package guru.springframework.aapetclinic.services.springdatajpa;

import guru.springframework.aapetclinic.model.Owner;
import guru.springframework.aapetclinic.repositories.OwnerRepository;
import guru.springframework.aapetclinic.repositories.PetRepository;
import guru.springframework.aapetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class) // this setup junit5 env for mockito
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";
    Owner returnOwner;

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks // inject the above mocks to this service
    OwnerSDJpaService service;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1l).lastName(LAST_NAME).build();
    }

    @Test
    void findAll() {
        Set<Owner> returnedOwnerSet = new HashSet<>();
        returnedOwnerSet.add(Owner.builder().id(1L).build());
        returnedOwnerSet.add(Owner.builder().id(2L).build());

        Mockito.when(ownerRepository.findAll()).thenReturn(returnedOwnerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        Mockito.when(ownerRepository.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(returnOwner));

        Owner owner = service.findById(1L);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        Mockito.when(ownerRepository.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.empty());

        Owner owner = service.findById(1L);

        assertNull(owner);
    }


    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        Mockito.when(ownerRepository.save(ArgumentMatchers.any()))
                .thenReturn(returnOwner);

        Owner saveOwner = service.save(ownerToSave);

        assertNotNull(saveOwner);

        Mockito.verify(ownerRepository).save(ArgumentMatchers.any());
    }

    @Test
    void delete() {
        service.delete(returnOwner);

        Mockito.verify(ownerRepository, Mockito.times(1)) // one times is default
                .delete(ArgumentMatchers.any());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);

        Mockito.verify(ownerRepository).deleteById(ArgumentMatchers.anyLong());
    }

    @Test
    void findByLastName() {

        Mockito
                .when(ownerRepository.findByLastName(ArgumentMatchers.any()))
                .thenReturn(returnOwner);

        Owner smith = service.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());

        Mockito.verify(ownerRepository).findByLastName(ArgumentMatchers.any());
    }
}