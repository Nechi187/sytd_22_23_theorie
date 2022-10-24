package at.htl.scooter_rental.model_scooter.empoyees;

import at.htl.scooter_rental.model_scooter.AEntity;
import at.htl.scooter_rental.model_scooter.location.Cities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Employees extends AEntity {

    @Column(nullable = false,length = 100)
    @NotNull
    private String firstName;

    @Column(nullable = false,length=100)
    @NotNull
    private String lastName;

    @Column(nullable = false,length=100)
    @NotNull
    private String socialSecurityNumber;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cities city;
}
