package at.htl.scooter_rental.integrationTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class PingResourceIntegrationTest {
    @LocalServerPort
    private Long port;
    RestTemplate restTemplate  = new RestTemplate();
    @Test
    public void pingService(){
        String requestURL = String.format("http://%s:%s/%s/%s/%s","localhost",port.toString(),"ScooterRental","pings","greeting");
        ResponseEntity<String> httpResponse = restTemplate.getForEntity(requestURL, String.class);
        assertEquals(HttpStatus.OK, httpResponse.getStatusCode());
        assertEquals(httpResponse.getBody(), "Guten Morgen");
    }
}
