package co.cue.edu.gestioninventariosamuelbuitrago.service;

import co.cue.edu.gestioninventariosamuelbuitrago.model.Product;
import co.cue.edu.gestioninventariosamuelbuitrago.model.StockMovimiento;
import co.cue.edu.gestioninventariosamuelbuitrago.repository.ProductRepository;
import co.cue.edu.gestioninventariosamuelbuitrago.repository.StockMovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StockService {

    @Autowired
    private StockMovimientoRepository stockRepository;

    @Autowired
    private ProductRepository productRepository;

    public StockMovimiento registerMovement(Long productId, String type, int quantity) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (type.equals("entrada")) {
            product.setStock(product.getStock() + quantity);
        } else if (type.equals("salida")) {
            product.setStock(product.getStock() - quantity);
        }
        productRepository.save(product);
        StockMovimiento movimiento = StockMovimiento.builder()
                .product(product)
                .type(type)
                .quantity(quantity)
                .date(LocalDateTime.now())
                .build();
        return stockRepository.save(movimiento);
    }

}
