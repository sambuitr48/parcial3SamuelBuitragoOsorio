package co.cue.edu.gestioninventariosamuelbuitrago.service;

import co.cue.edu.gestioninventariosamuelbuitrago.model.Category;
import co.cue.edu.gestioninventariosamuelbuitrago.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category create(Category category) {
        return repository.save(category);
    }

    public Category update(Long id, Category category) {
        category.setId(id);
        return repository.save(category);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
