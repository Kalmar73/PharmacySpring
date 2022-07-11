package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.Available_Goods;

public interface AvailGoodsRepository extends JpaRepository<Available_Goods,Long> {
}
