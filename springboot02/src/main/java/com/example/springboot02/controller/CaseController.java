package com.example.springboot02.controller;

import com.example.springboot02.entity.Case;
import com.example.springboot02.model.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CaseController {

    @Autowired
    CaseRepository caseRepository;

    @RequestMapping("/case")
    public String index(Model model)
    {
        List<Case> cases = (List<Case>) caseRepository.findAll();
        model.addAttribute("cases",cases);

        return "tableCase";
    }
}
