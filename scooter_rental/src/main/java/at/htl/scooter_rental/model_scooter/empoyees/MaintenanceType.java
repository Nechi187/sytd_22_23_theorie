package at.htl.scooter_rental.model_scooter.empoyees;

import at.htl.scooter_rental.model_scooter.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class MaintenanceType extends AEntity {
    @Column(nullable = false)
    @NotNull
    private String MaintenanceType;
}
