package at.htl.scooter_rental.model_scooter.Scooter;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Models {
    @EmbeddedId
    private Modelid modelid;
    @Column(nullable = false)
    @NotNull
    @Min(0)
    private Long service_Interval;



}
