package com.applab.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applab.Services.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/operacion")
    public String suma(@RequestParam  double a, @RequestParam double b, @RequestParam String operacion) {
        return "El resultado de la operación es: "+calculadoraService.calcular(a, b, operacion);
    }
    


}
