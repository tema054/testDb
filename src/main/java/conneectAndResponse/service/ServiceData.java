package conneectAndResponse.service;

import conneectAndResponse.repository.CrudRepo;
import lombok.extern.java.Log;

import org.springframework.stereotype.Service;


@Log
@Service
public class ServiceData {

    public int getTime() {
        CrudRepo crudRepo = new CrudRepo();
        return crudRepo.count();
    }
}
