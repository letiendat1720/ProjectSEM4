package com.example.springboot02.controller;

import com.example.springboot02.entity.User;
import com.example.springboot02.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user")
    public String index(Model model)
    {
        List<User> users = (List<User>) userRepository.findAll();
        model.addAttribute("users",users);

        return "tableUser";
    }
}
