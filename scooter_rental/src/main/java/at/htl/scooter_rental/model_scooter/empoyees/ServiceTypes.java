package at.htl.scooter_rental.model_scooter.empoyees;

import at.htl.scooter_rental.model_scooter.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@Entity
public class ServiceTypes extends AEntity {
    @NotNull
    @Column(nullable = false)
    private String type;
}
