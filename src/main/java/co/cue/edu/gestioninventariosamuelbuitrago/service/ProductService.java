package co.cue.edu.gestioninventariosamuelbuitrago.service;

import co.cue.edu.gestioninventariosamuelbuitrago.model.Product;
import co.cue.edu.gestioninventariosamuelbuitrago.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product update(Long id, Product product) {
        product.setId(id);
        return repository.save(product);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Product> getLowStock() {
        return repository.findByStockLessThan(10);
    }
}
