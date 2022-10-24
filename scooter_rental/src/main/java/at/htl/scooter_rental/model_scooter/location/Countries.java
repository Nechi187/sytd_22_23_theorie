package at.htl.scooter_rental.model_scooter.location;

import at.htl.scooter_rental.model_scooter.AVersionedEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity

public class Countries extends AVersionedEntity {
    @Id
    @Column(nullable=false,length=3,unique=true)
    private String IsoCode;

    @Column(nullable = false, length=50)
    @NotNull
    @Size(max=50)
    private String name;
}
