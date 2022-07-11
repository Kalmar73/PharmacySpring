package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.Characteristics;

public interface CharRepository extends JpaRepository<Characteristics,Long> {
}
