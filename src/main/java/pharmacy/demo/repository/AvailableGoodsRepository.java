package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.AvailableGoods;

public interface AvailableGoodsRepository extends JpaRepository<AvailableGoods,Long> {
}
