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
public class Characteristic extends BaseEntity{
    @Column(name = "Name")
    private String name;
}
