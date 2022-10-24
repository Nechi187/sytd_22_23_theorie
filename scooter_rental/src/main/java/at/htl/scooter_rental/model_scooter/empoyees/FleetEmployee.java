package at.htl.scooter_rental.model_scooter.empoyees;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class FleetEmployee {

    @Column(nullable = false)
    private Long maxScooter;

    @Column(nullable = false)
    private Double ratePerScooter;
}
