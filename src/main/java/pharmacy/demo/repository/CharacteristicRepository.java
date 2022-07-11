package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.Characteristic;

public interface CharacteristicRepository extends JpaRepository<Characteristic,Long> {
}
