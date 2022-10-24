package at.htl.scooter_rental.model_scooter.Customer;

import at.htl.scooter_rental.model_scooter.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
public class Customer extends AEntity {
    @Column(nullable = false)
    @NotNull
    private String firstName;
    @Column(nullable = false)
    @NotNull
    private String lastName;
    @Column(nullable = false)
    @NotNull
    private String identificationnumber;
    @Column(nullable = false)
    @NotNull
    private String bankaccountnumber;
    @Column(nullable = false)
    @NotNull
    private Date birthdate;
    @Column(nullable = false)
    @NotNull
    private String password;
}
