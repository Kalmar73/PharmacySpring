package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Available_Goods")
@Getter
@Setter
@ToString
public class Available_Goods extends BaseEntity{
    @Column(name = "Pharmacy_Number")
    private String pharNumb;
    @Column(name = "Goods_Code")
    private String goodsCode;
    @Column(name = "Payment_Type")
    private String paymentType;
    @Column(name = "Price")
    private BigDecimal price;
}
