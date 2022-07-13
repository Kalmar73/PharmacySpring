package pharmacy.demo.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "goods", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private List<AvailableGoods> availableGoodsList;

    @OneToMany(mappedBy = "goods", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private List<GoodsCharacteristics> goodsCharacteristicsList;


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

    public List<AvailableGoods> getAvailableGoodsList() {
        return availableGoodsList;
    }

    public void setAvailableGoodsList(List<AvailableGoods> availableGoodsList) {
        this.availableGoodsList = availableGoodsList;
    }

    public List<GoodsCharacteristics> getGoodsCharacteristicsList() {
        return goodsCharacteristicsList;
    }

    public void setGoodsCharacteristicsList(List<GoodsCharacteristics> goodsCharacteristicsList) {
        this.goodsCharacteristicsList = goodsCharacteristicsList;
    }
}
