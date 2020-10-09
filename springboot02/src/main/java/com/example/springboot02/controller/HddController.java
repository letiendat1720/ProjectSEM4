package com.example.springboot02.controller;


import com.example.springboot02.entity.Case;
import com.example.springboot02.entity.Hdd;
import com.example.springboot02.model.CaseRepository;
import com.example.springboot02.model.HddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HddController {

    @Autowired
    HddRepository hddRepository;

    @RequestMapping("/hdd")
    public String index(Model model)
    {
        List<Hdd> hdds = (List<Hdd>) hddRepository.findAll();
        model.addAttribute("hdds",hdds);

        return "tableHdd";
    }
}