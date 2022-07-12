package pharmacy.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Goodscharacteristics")
@Data
public class GoodsCharacteristics extends BaseEntity{

    @Column(name = "Description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    private Characteristic characteristic;

    @ManyToOne(fetch = FetchType.EAGER)
    private Goods goods;
}
