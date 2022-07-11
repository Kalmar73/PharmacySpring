package pharmacy.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Pharmacy")
@Getter
@Setter
@ToString
public class Pharmacy extends BaseEntity {
    @Column(name = "Name")
    private String name;
    @Column(name = "Address")
    private String adress;
    @Column(name = "Director_FullName")
    private String fullname;
    @Column(name = "Phone_Number")
    private String phoneNumber;
}
