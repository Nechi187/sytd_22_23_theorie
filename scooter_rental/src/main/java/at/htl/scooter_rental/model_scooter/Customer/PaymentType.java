package at.htl.scooter_rental.model_scooter.Customer;

import at.htl.scooter_rental.model_scooter.AEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.loader.entity.plan.AbstractBatchingEntityLoaderBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class PaymentType extends AEntity {
    @NotNull
    @Column(nullable = false)
    private String type;
}
