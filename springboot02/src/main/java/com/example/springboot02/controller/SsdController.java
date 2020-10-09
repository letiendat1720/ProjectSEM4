package com.example.springboot02.controller;

import com.example.springboot02.entity.Ssd;
import com.example.springboot02.model.SsdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SsdController {

    @Autowired
    SsdRepository ssdRepository;

    @RequestMapping("/ssd")
    public String index(Model model)
    {
        List<Ssd> ssds = (List<Ssd>) ssdRepository.findAll();
        model.addAttribute("ssds",ssds);

        return "tableSsd";
    }
}