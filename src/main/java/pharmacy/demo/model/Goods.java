package pharmacy.demo.model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "goods",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AvailableGoods> availableGoodsList;
}
