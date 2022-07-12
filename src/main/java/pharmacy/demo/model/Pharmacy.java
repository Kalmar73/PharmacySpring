package pharmacy.demo.model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pharmacy")
@Data
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "fullname")
    private String fullname;


    @OneToMany(mappedBy = "pharmacy",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AvailableGoods> availableGoodsList;
}
