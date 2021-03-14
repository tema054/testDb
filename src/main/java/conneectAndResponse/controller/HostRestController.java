package conneectAndResponse.controller;

import conneectAndResponse.service.ServiceData;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor


public class HostRestController {

    private ServiceData serviceData ;

    @GetMapping("/getTime")
    public Long getTime () {
        return serviceData.getCount();
    }

    @GetMapping("/getDual")
    public String getDual () {
        return serviceData.getDual();
    }
}
