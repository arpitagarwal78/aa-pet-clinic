package guru.springframework.aapetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners") // setup table owner
public class Owner extends Person{

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    // set up a relationship mapping
    // owner can have multiple pets
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner") // if we delete owner the pets of owner will also be deleted
    private Set<Pet> pets = new HashSet<>();

    @Builder // this is done to setup builder pattern
    public Owner(Long id, String firstName, String lastName, String address,
                 String city, String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }
}
