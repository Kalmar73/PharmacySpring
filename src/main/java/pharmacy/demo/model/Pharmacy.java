package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pharmacy")
@Getter
@Setter
@ToString
public class Pharmacy extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "fullname")
    private String fullname;
}
