package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.GoodsCharacteristics;

public interface GoodsCharacteristicsRepository extends JpaRepository<GoodsCharacteristics,Long> {
}
