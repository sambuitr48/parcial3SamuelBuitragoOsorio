package co.cue.edu.gestioninventariosamuelbuitrago.controller;

import co.cue.edu.gestioninventariosamuelbuitrago.model.Category;
import co.cue.edu.gestioninventariosamuelbuitrago.model.Product;
import co.cue.edu.gestioninventariosamuelbuitrago.service.CategoryService;
import co.cue.edu.gestioninventariosamuelbuitrago.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/vista")
    public String vistaProductos(Model model) {
        model.addAttribute("products", service.findAll());
        model.addAttribute("categories", categoryService.findAll());
        return "productos";
    }

    @ResponseBody
    @GetMapping
    public List<Product> getAll() {
        return service.findAll();
    }

    @ResponseBody
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

    @PostMapping("/form")
    public String createFromForm(@RequestParam String name, @RequestParam double price,
                                 @RequestParam int stock, @RequestParam("category.id") Long categoryId) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setStock(stock);
        Category category = new Category();
        category.setId(categoryId);
        product.setCategory(category);
        service.create(product);
        return "redirect:/products/vista";
    }

    @ResponseBody
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @ResponseBody
    @GetMapping("/low-stock")
    public List<Product> getLowStock() {
        return service.getLowStock();
    }
}
