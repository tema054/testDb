package conneectAndResponse.controller;

import conneectAndResponse.service.ServiceData;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class HostRestController {

    private ServiceData serviceData  ;

    @GetMapping("/getDual")
    public String getDual () {
        return serviceData.getDual();
    }
}
