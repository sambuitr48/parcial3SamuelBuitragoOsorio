package co.cue.edu.gestioninventariosamuelbuitrago;

import co.cue.edu.gestioninventariosamuelbuitrago.model.Category;
import co.cue.edu.gestioninventariosamuelbuitrago.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestsUnitarios {

    //profe estos son los tests de logica de backend
    @Test
    void incrementarStock() {
        Product product = new Product();
        product.setStock(5);
        int entrada = 3;
        product.setStock(product.getStock() + entrada);
        assertEquals(8, product.getStock());
    }

    @Test
    void disminuirStock() {
        Product product = new Product();
        product.setStock(10);
        int salida = 4;
        product.setStock(product.getStock() - salida);
        assertEquals(6, product.getStock());
    }

    @Test
    void asignarCategoriaProducto() {
        Category category = new Category();
        category.setName("gasimbas");
        Product product = new Product();
        product.setCategory(category);
        assertEquals("gasimbas", product.getCategory().getName());
    }

    //este es el de validacion
    @Test
    void nombreProductoNoVacio() {
        Product product = new Product();
        product.setName("");
        boolean isValid = product.getName() != null && !product.getName().isBlank();
        assertFalse(isValid);
    }

}
