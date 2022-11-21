package at.htl.scooter_rental.Service;

import at.htl.scooter_rental.domain.ICustomerRepository;
import at.htl.scooter_rental.model_scooter.Customer.Customer;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/customers")
@RestController
@Slf4j
public class CustomerResource {

    @Autowired
    private ICustomerRepository customerRepository;

    @GetMapping(path="/{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public at.htl.scooter_rental.model_scooter.Customer.Customer Customer(@PathVariable("customerId") Long customerId)
    {
        log.info("request customer with id:"+customerId);
        return customerRepository.findById(customerId).get();
    }

    @PostMapping(path = "/createCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody @Valid Customer customer)
    {

        customerRepository.save(customer);

        log.info("Created customer with id"+customer.getId());
        return (Customer) Hibernate.unproxy(customer);
    }

}
