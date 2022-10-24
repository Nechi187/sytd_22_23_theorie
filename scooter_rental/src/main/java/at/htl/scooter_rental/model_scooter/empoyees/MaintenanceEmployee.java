package at.htl.scooter_rental.model_scooter.empoyees;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
public class MaintenanceEmployee extends Employees {

}
