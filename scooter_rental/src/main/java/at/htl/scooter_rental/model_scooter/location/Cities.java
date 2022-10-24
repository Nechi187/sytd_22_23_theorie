package at.htl.scooter_rental.model_scooter.location;

import at.htl.scooter_rental.model_scooter.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Cities extends AEntity {
    @Column(nullable = false,length=100)
    @NotNull
    @Size(max=100)
    private String name;

    @Column(nullable = false)
    @NotNull

    private Long inhabitants;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Countries country;

}
