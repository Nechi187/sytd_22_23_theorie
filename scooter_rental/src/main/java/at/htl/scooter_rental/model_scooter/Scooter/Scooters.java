package at.htl.scooter_rental.model_scooter.Scooter;

import at.htl.scooter_rental.model_scooter.AVersionedEntity;
import at.htl.scooter_rental.model_scooter.location.Cities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@Entity
public class Scooters extends AVersionedEntity {
    @Column(nullable = false, length = 50)
    @Id
    @Size(max = 50)
    @NotNull
    private String serialNumber;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    @NotNull
    private Date purchaseDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    @NotNull
    private Date scrappingDate;

    @ManyToOne
    @JoinColumns(value = {@JoinColumn(nullable = false),
            @JoinColumn(nullable = false)
    })
    private Models model;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Long batteryLevel;

    @ManyToOne
    @NotNull
    @JoinColumn(nullable = false)
    private Cities city;
}
