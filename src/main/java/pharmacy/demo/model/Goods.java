package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Goods")
@Getter
@Setter
@ToString
public class Goods extends BaseEntity{
    @Column(name = "Goods_Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "Category_Code")
    private String categoryCode;
}
