package pharmacy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacy.demo.model.Category;

public interface CategRepository extends JpaRepository<Category,Long> {
}
