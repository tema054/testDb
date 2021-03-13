package conneectAndResponse.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.math.BigDecimal;



@Entity
@Table(name = "Regions")
@NoArgsConstructor
@Getter
@Setter
public class Regions {
    @Id
    private int RegionId;


    @JoinColumn(name = "region_name")
    private String RegionName;


    public String getName() {
        return RegionName;
    }
}