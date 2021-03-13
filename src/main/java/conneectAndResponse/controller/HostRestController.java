package conneectAndResponse.controller;

import conneectAndResponse.service.ServiceData;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Log
public class HostRestController {
    private ServiceData serviceData = new ServiceData();

    @GetMapping("/getTime")
    public String getTime () {
        return serviceData.getTime();
    }
}
