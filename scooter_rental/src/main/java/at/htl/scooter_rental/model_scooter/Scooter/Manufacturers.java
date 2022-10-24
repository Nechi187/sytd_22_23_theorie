package at.htl.scooter_rental.model_scooter.Scooter;

import at.htl.scooter_rental.model_scooter.AEntity;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Manufacturers extends AEntity {

    @Column(nullable = false, length = 100)
    @NotNull
    @Size(max=100)
    private String name;
}
