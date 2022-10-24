package at.htl.scooter_rental.model_scooter.empoyees;

import at.htl.scooter_rental.model_scooter.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Maintenance extends AEntity {
    @ManyToOne
    @JoinColumn(nullable = false)
    private ServiceTypes serviceTypes;

    @ManyToOne
    @JoinColumn(nullable = false)
    @NotNull
    private MaintenanceEmployee maintenanceEmployee;

    @ManyToOne
    @JoinColumn(nullable = false)
    @NotNull
    private MaintenanceType maintenanceType;
}
