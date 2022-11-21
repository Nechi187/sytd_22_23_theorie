package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model_scooter.Scooter.Manufacturers;
import at.htl.scooter_rental.model_scooter.Scooter.Scooters;
import at.htl.scooter_rental.model_scooter.location.Countries;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IScooterRepository extends JpaRepository<Scooters, String> {

    List<Scooters> findScootersBySerialNumber(String serialNumber);
    List<Scooters> findScootersByModel_Modelid_Manufacturers(Manufacturers manufacturers);
    List<Scooters> findScootersByModel_Modelid_Manufacturers_Name(String manufacturerName);
// 15. Finden Sie alle Scooter eines bestimmten Landes. Die Abfrage sollte Pageweise  40// abgefragt – werden können.
    @Query("select s from Scooters  s where s.city.country= :country order by s.serialNumber")
    Page<Scooters> getScooterByCountryOrderBySerialNumber(@Param("country")String countrieiso, Pageable pageable);

}
