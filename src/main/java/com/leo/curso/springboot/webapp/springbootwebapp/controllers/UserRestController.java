package com.leo.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.curso.springboot.webapp.springbootwebapp.models.User;
import com.leo.curso.springboot.webapp.springbootwebapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {
    User user = new User("Leo", "Estrada");
    User user2 = new User("Saria", "Estrada");
    User user3 = new User("Gonzalo", "Estrada");

    @GetMapping("/restDetails")
    public UserDto details(Model model) {
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo!");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {

        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    // public Map<String, Object> details(Model model) {
    // Map<String, Object> body = new HashMap<>();
    // body.put("title", "Hola mundo!");
    // body.put("user", user);

    // return body;
    // }
}
