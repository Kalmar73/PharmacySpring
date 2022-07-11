package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy,Long> {
}
