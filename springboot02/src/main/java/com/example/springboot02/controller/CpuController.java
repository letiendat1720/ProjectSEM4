package com.example.springboot02.controller;

import com.example.springboot02.entity.Cpu;
import com.example.springboot02.model.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CpuController {

    @Autowired
    CpuRepository cpuRepository;

    @RequestMapping("/cpu")
    public String index(Model model)
    {
        List<Cpu> cpus = (List<Cpu>) cpuRepository.findAll();
        model.addAttribute("cpus",cpus);

        return "tableCpu";
    }
}