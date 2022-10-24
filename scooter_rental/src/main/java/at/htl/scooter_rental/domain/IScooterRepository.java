package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model_scooter.Scooter.Manufacturers;
import at.htl.scooter_rental.model_scooter.Scooter.Scooters;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IScooterRepository extends JpaRepository<Scooters, String> {

    List<Scooters> findScootersBySerialNumber(String serialNumber);
    List<Scooters> findScootersByModel_Modelid_Manufacturers(Manufacturers manufacturers);
    List<Scooters> findScootersByModel_Modelid_Manufacturers_Name(String manufacturerName);
}
