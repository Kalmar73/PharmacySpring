package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.Goods;

public interface GoodsRepository extends JpaRepository<Goods,Long> {
}
