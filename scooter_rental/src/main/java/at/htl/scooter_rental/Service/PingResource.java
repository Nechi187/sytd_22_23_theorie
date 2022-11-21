package at.htl.scooter_rental.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RequestMapping("/pings")
@RestController
@Slf4j
public class PingResource {


    @GetMapping(path = "/greeting",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String greeting()
    {
        log.info("ping Service requested");

        return "Guten Morgen";
    }


}
