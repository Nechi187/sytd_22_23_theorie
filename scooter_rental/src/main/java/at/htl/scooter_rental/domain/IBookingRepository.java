package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model_scooter.Customer.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findBookingsByCustomer_IdOrderByStartDateDesc(Long customerId);

    // 10. Geben Sie für einen Kunden alle Buchungen aus. 6// Sortieren Sie das Ergebnis nach dem Buchungsdatum absteigend. 7// Daten: customer(1L) 8// expected: bookings.size, 4

    @Query("select b from Booking b where b.customer.id = :customerId order by b.startDate desc")
    List<Booking> findAllBookingsbyCustomerIDQuery(@Param("customerId") Long customerId);


}
