package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GoodsCharacteristics")
@Getter
@Setter
@ToString
public class GoodsCharacteristics extends BaseEntity{
    @Column(name = "CharId")
    private Long charId;
    @Column(name = "GoodsId")
    private Long goodsId;
    @Column(name = "Description")
    private String description;
}
