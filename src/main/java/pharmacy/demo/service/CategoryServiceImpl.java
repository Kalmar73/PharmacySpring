package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.Category;
import pharmacy.demo.repository.CategRepository;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategRepository categRepository;

    @Override
    public Category getById(Long id) {
        return categRepository.findOne(id);
    }

    @Override
    public void save(Category category) {
        categRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        categRepository.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return categRepository.findAll();
    }
}
