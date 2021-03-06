package conneectAndResponse.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Regions")
@NoArgsConstructor
@Getter
@Setter
public class Regions {
    @Id
    @GeneratedValue
    @JoinColumn(name = "region_id")
    private int RegionId;

    @JoinColumn(name = "region_name")
    private String RegionName;

    public String getName() {
        return RegionName;
    }
}