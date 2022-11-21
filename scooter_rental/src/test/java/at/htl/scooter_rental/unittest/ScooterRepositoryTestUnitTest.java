package at.htl.scooter_rental.unittest;

import at.htl.scooter_rental.domain.IManufacturerRepository;
import at.htl.scooter_rental.domain.IScooterRepository;
import at.htl.scooter_rental.model_scooter.Scooter.Scooters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class ScooterRepositoryTestUnitTest {

    @Autowired
    private IManufacturerRepository manufacturerRepository;
    @Autowired
    private IScooterRepository scooterRepository;
    @Test
    void findScootersBySerialNumber() {
       List<Scooters> scooterList= scooterRepository.findScootersBySerialNumber("123abc");
        Assertions.assertEquals(1, scooterList.size());


    }


    @Test
    void findAllScooters() {
        List<Scooters> scootersList = scooterRepository.findAll();
        Assertions.assertEquals(4,scootersList.size());

    }

    @Test
    void findScooterByModel_Modelid_ManufacturersTest()
    {
        //Keine Ahnung
    }
    @Test
    void getScooterByCountryOrderBySerialNumberTest()
    {
        Pageable pageable = PageRequest.of(1,2);

        Page<Scooters> scooters = scooterRepository.getScooterByCountryOrderBySerialNumber("AUT" , pageable);
                Assertions.assertEquals("123abc",scooters.getContent().get(0).getSerialNumber());

    }
}