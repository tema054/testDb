package conneectAndResponse.service;

import conneectAndResponse.repository.CrudRepo;
import lombok.extern.java.Log;

import org.springframework.stereotype.Service;


@Log
@Service
public class ServiceData {
    private CrudRepo crudRepo;

    public Long getCount() {
        return crudRepo.count();
    }
}
