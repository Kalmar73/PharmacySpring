package pharmacy.demo.model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Characteristic")
@Data
public class Characteristic{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "characteristic",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<GoodsCharacteristics> goodsCharacteristicsList;
}
