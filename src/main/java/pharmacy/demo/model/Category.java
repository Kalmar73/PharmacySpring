package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
@Getter
@Setter
@ToString
public class Category extends BaseEntity{
    @Column(name = "Category_Name")
    private String name;
    @Column(name = "Category_Code")
    private String categoryCode;
}
