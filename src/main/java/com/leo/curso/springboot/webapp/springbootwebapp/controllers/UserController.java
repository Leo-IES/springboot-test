package com.leo.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola mundo!");
        model.addAttribute("name", "Leo");
        model.addAttribute("lastname", "Estrada");


        return "details";
    }
}
