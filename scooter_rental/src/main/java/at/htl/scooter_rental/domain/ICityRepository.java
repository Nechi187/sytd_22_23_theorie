package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model_scooter.location.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICityRepository extends JpaRepository<Cities,Long> {

    // 12. Finden Sie den Umsatz in einer bestimmten Stadt. 21// Daten: City Instanz 22// expected: bookings.size, 300

    @Query("select sum(b.costs) from Booking b where b.scooters.city=:cities")
    Double findTotalEarningsByCities(@Param("cities")Cities cities);
}
