package com.leo.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.curso.springboot.webapp.springbootwebapp.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
    User user = new User("Leo", "Estrada");

    @GetMapping("/restDetails")
    public Map<String, Object> details(Model model) {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo!");
        body.put("user", user);

        return body;
    }
}
