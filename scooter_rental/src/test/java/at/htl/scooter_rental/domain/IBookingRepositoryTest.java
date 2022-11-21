package at.htl.scooter_rental.domain;

import at.htl.scooter_rental.model_scooter.Customer.Booking;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class IBookingRepositoryTest {

    @Autowired
    private IBookingRepository bookingRepository;
    @Test
    void findBookingsByCustomer_IdOrderByStartDateDesc() {
        List<Booking> bookingList =bookingRepository.findBookingsByCustomer_IdOrderByStartDateDesc(1l);
        Assertions.assertEquals(1,bookingList.size());
    }
}