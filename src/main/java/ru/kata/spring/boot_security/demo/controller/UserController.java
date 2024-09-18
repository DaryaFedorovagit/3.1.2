package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserRepository userDetails;

    @Autowired
    public UserController(UserRepository userDetails) {
        this.userDetails = userDetails;
    }

    @GetMapping(value = "")
    public String userInfo(Model model, Principal principal) {
        User user = userDetails.findUserByUsername(principal.getName());
        model.addAttribute("user", user);
        return "user";

    }
}