package co.cue.edu.gestioninventariosamuelbuitrago.controller;

import co.cue.edu.gestioninventariosamuelbuitrago.model.Category;
import co.cue.edu.gestioninventariosamuelbuitrago.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("/vista")
    public String vistaCategorias(Model model) {
        model.addAttribute("categories", service.findAll());
        return "categorias";
    }

    @ResponseBody
    @GetMapping
    public List<Category> getAll() {
        return service.findAll();
    }

    @ResponseBody
    @PostMapping
    public Category create(@RequestBody Category category) {
        return service.create(category);
    }

    @PostMapping("/form")
    public String createFromForm(@RequestParam String name, @RequestParam String description) {
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        service.create(category);
        return "redirect:/categories/vista";
    }

    @ResponseBody
    @PutMapping("/{id}")
    public Category update(@PathVariable Long id, @RequestBody Category category) {
        return service.update(id, category);
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
