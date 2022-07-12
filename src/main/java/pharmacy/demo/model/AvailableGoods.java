package pharmacy.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "Availablegoods")
public class AvailableGoods extends BaseEntity{


    private BigDecimal price;

    private Long amount;

    @ManyToOne(fetch = FetchType.EAGER)
    private Pharmacy pharmacy;

    @ManyToOne(fetch = FetchType.EAGER)
    private Goods goods;
}
