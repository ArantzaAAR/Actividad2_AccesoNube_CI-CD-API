package com.da.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EstadoControlador {
    @GetMapping("/")
    public String inicio() {
        return "Fin de la práctica: CI/CD con GitHub Actions y AWS Elastic Beanstalk";
    }
    @GetMapping("/api/estado")
    public Map<String, Object> estado() {
        return Map.of(
                "estado", "OK",
                "servicio", "dam-ci-cd-api-001",
                "mensaje", "API operativa"
        );
    }
    @GetMapping("/saludo")
    public String saludo() {
        return "Este es el ejemplo que quiero que veáis";
    }
}
