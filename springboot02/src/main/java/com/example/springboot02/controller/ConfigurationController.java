package com.example.springboot02.controller;

import com.example.springboot02.entity.Configuration;
import com.example.springboot02.model.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ConfigurationController {
    @Autowired
    ConfigurationRepository configurationRepository;

    @RequestMapping("/configuration")
    public String index(Model model)
    {
        List<Configuration> configurations = (List<Configuration>) configurationRepository.findAll();
        model.addAttribute("configurations", configurations);

        return "tableConfiguration";
    }
    @RequestMapping(value = "/addConfiguration")
    public String addConfiguration(Model model)
    {
        model.addAttribute("configurations",new Configuration());
        return "addConfiguration";

    }

    @RequestMapping(value = "/saveConfiguration", method = RequestMethod.POST)
    public String saveConfiguration(Configuration configuration)
    {
        configurationRepository.save(configuration);
        return "redirect:/configuration";
    }


    @RequestMapping(value = "/editConfiguration", method = RequestMethod.GET)
    public String editConfiguration(@RequestParam("id") Long configurationId, Model model)
    {
        Optional<Configuration> configurationEdit = configurationRepository.findById(configurationId);
        configurationEdit.ifPresent(configuration -> model.addAttribute("configuration", configuration));
        return "editConfiguration";
    }

    @RequestMapping(value = "/deleteConfiguration", method = RequestMethod.GET)
    public String deleteConfiguration(@RequestParam("id") Long configurationId, Model model)
    {
        configurationRepository.deleteById(configurationId);
        return "redirect:/configuration";
    }

    @RequestMapping(value = "/deleteAllConfiguration", method = RequestMethod.GET)
    public String deleteAllConfiguration(Model model)
    {
        configurationRepository.deleteAll();
        return "redirect:/configuration";
    }
}
