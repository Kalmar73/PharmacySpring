package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Goods_Characteristics")
@Getter
@Setter
@ToString
public class Goods_Characteristic extends BaseEntity{
    @Column(name = "Goods_Code")
    private String goodsCode;
    @Column(name = "Characteristics_Code")
    private String charactCode;
    @Column(name = "Characteristics_Description")
    private String charactDesc;
}
