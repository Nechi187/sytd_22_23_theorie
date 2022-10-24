package at.htl.scooter_rental.model_scooter;

import lombok.Getter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@Getter
@MappedSuperclass
public class AVersionedEntity implements Serializable  {

    @Version
    private Long version;
}
