package vuong.nguyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vuong.nguyen.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
