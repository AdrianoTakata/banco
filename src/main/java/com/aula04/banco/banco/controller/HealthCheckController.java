package com.aula04.banco.banco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {

    @GetMapping("/health-check")
    @ResponseBody  // o returno do método retornará direto ao usuário
    public String healthCheck() {
//        modelo.addAttribute("mensagem", "Aplication running!");
        return "Server Running"; // Retornar com o mesmo nome do html
    }



}
