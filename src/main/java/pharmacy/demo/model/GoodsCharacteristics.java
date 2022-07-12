package pharmacy.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "Goodscharacteristics")
public class GoodsCharacteristics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Column(name = "Description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    private Characteristic characteristic;

    @ManyToOne(fetch = FetchType.EAGER)
    private Goods goods;
}
