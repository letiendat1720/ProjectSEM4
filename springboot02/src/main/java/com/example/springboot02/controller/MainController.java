package com.example.springboot02.controller;

import com.example.springboot02.entity.Main;
import com.example.springboot02.model.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    MainRepository mainRepository;

    @RequestMapping("/main")
    public String index(Model model)
    {
        List<Main> mains = (List<Main>) mainRepository.findAll();
        model.addAttribute("mains",mains);

        return "tableMain";
    }
}
