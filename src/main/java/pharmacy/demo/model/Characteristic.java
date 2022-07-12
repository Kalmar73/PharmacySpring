package pharmacy.demo.model;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Characteristic")
public class Characteristic{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GoodsCharacteristics> getGoodsCharacteristicsList() {
        return goodsCharacteristicsList;
    }

    public void setGoodsCharacteristicsList(List<GoodsCharacteristics> goodsCharacteristicsList) {
        this.goodsCharacteristicsList = goodsCharacteristicsList;
    }

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "characteristic",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<GoodsCharacteristics> goodsCharacteristicsList;
}
