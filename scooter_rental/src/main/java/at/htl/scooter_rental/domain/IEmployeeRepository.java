package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model_scooter.empoyees.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employees, Long> {
}
