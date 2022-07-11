package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "AvailableGoods")
@Getter
@Setter
@ToString
public class AvailableGoods extends BaseEntity{
    @Column(name = "PharmacyId")
    private Long pharmacyId;
    @Column(name = "GoodsId")
    private Long goodsId;
    @Column(name = "Price")
    private BigDecimal price;
    @Column(name = "Amount")
    private Long amount;
}
