package org.CidnelsonJounin.IMCAV.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/IMCAV")
public class IMCAVController {
    @GetMapping
    public String calcularIMC(@RequestParam int peso, @RequestParam float altura) {
        float imc = peso / ((altura / 100) * (altura / 100));

        if (imc < 18.50) {
            return "IMC " + imc + " | Abaixo do peso | Risco Elevado";
        } else if (18.50 < imc && imc < 24.99) {
            return "IMC " + imc + " | Peso Ideal | Risco Inexistente";
        } else if (25.00 < imc && imc < 29.99) {
            return "IMC " + imc + " | Excesso de Peso | Risco Elevado";
        } else if (30 < imc && imc < 34.99) {
            return "IMC " + imc + " | Obesidade Grau 1 | Risco Muito Elevado";
        } else if (35 < imc && imc < 39.99) {
            return "IMC " + imc + " | Obesidade Grau 2 | Risco Multíssimo Elevado";
        } else {
            return "IMC " + imc + " | Obesidade Grau 3 | Obesidade Mórbida";
        }
    }
}
