package conneectAndResponse.repository;
import conneectAndResponse.entity.Regions;

public interface Repo {

    int count();
    int save(Regions regions);

}