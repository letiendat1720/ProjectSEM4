package com.example.springboot02.controller;

import com.example.springboot02.entity.Vga;
import com.example.springboot02.model.VgaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VgaController {
    @Autowired
    VgaRepository vgaRepository;

    @RequestMapping("/vga")
    public String index(Model model)
    {
        List<Vga> vgas = (List<Vga>) vgaRepository.findAll();
        model.addAttribute("vgas", vgas);

        return "tableVga";
    }
}
