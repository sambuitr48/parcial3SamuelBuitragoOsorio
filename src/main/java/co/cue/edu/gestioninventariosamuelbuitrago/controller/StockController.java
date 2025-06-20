package co.cue.edu.gestioninventariosamuelbuitrago.controller;

import co.cue.edu.gestioninventariosamuelbuitrago.model.StockMovimiento;
import co.cue.edu.gestioninventariosamuelbuitrago.repository.StockMovimientoRepository;
import co.cue.edu.gestioninventariosamuelbuitrago.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService service;

    @Autowired
    private StockMovimientoRepository stockMovimientoRepository;

    @GetMapping("/vista")
    public String vistaStock(Model model) {
        List<StockMovimiento> movimientos = stockMovimientoRepository.findAll();
        model.addAttribute("movimientos", movimientos);
        return "stock";
    }

    @ResponseBody
    @PostMapping
    public StockMovimiento register(@RequestParam Long productId, @RequestParam String type, @RequestParam int quantity) {
        return service.registerMovement(productId, type, quantity);
    }
}
