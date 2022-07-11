package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.Goods_Characteristic;

public interface GoodsCharRepository extends JpaRepository<Goods_Characteristic,Long> {
}
