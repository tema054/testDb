package conneectAndResponse.controller;

import conneectAndResponse.service.ServiceData;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

public class HostRestController {
    private ServiceData serviceData = new ServiceData();

    @GetMapping("/getTime")
    public Long getTime () {
        return serviceData.getCount();
    }
}
