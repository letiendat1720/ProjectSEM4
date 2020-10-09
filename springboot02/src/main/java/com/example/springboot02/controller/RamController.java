package com.example.springboot02.controller;

import com.example.springboot02.entity.Ram;
import com.example.springboot02.model.RamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RamController {

    @Autowired
    RamRepository ramRepository;

    @RequestMapping("/ram")
    public String index(Model model)
    {
        List<Ram> rams = (List<Ram>) ramRepository.findAll();
        model.addAttribute("rams",rams);

        return "tableRam";
    }
}
