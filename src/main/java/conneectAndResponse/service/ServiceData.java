package conneectAndResponse.service;

import conneectAndResponse.repository.CrudRepo;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class ServiceData {
    @Autowired
    private CrudRepo crudRepo;

    public Long getCount() {
        Long lng = crudRepo.count();
        return lng ;
    }

    public String getDual(){
        String string = crudRepo.dual();
        return string;
    }
}
