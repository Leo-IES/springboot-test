package com.leo.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.leo.curso.springboot.webapp.springbootwebapp.models.User;

@Controller
public class UserController {
    // @GetMapping("/details")
    // public String details(Model model) {
    // model.addAttribute("title", "Hola mundo!");
    // model.addAttribute("name", "Leo");
    // model.addAttribute("lastname", "Estrada");
    // // model.addAttribute("email", "leoies1607@gmail.com");

    // return "details";
    // }
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Leo", "Estrada");
        user.setEmail("leo@gmail.com");
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(new User("pepa", "gonzlez"), new User("Juanita", "Robles"));
        // List<User> users = new ArrayList<>();
        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de Usuarios");

        return "list";
    }
}
