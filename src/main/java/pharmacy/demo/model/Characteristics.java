package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Characteristics")
@Getter
@Setter
@ToString
public class Characteristics extends BaseEntity{
    @Column(name = "Characteristics_Code")
    private String charactCode;
    @Column(name = "Characteristics_Name")
    private String name;
    @Column(name = "Category_Code")
    private String categoryCode;
}
