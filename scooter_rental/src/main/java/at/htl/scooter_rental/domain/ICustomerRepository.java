package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model_scooter.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    // 11. Finden Sie alle eindeutigen Kunden, die schon einmal einen Scooter gebucht haben.

    @Query("select distinct b.customer from Booking b ")
    List<Customer> findAllDistinctCustomersWithBookings();
}
