package vuong.nguyen.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vuong.nguyen.model.Category;
import vuong.nguyen.repository.ICategoryRepository;

@Service
public class CategoryServiceIMPL implements ICategoryService{
    @Autowired
    ICategoryRepository categoryRepository;
    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }
}
