package conneectAndResponse.controller;

import conneectAndResponse.service.ServiceData;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HostRestController {

    @Autowired
    ServiceData serviceData  ;

    @GetMapping("/getDual")
    public String getDual () {
        return serviceData.getDual();
    }
}
