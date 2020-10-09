package com.example.springboot02.controller;


import com.example.springboot02.entity.Customer;
import com.example.springboot02.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/customer")
    public String index(Model model)
    {
        List<Customer> customers = (List<Customer>) customerRepository.findAll();
        model.addAttribute("customers",customers);

        return "tableCustomer";
    }
    @RequestMapping(value = "/addCustomer")
    public String addCustomer(Model model)
    {
        model.addAttribute("customers",new Customer());
        return "addCustomer";

    }

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public String saveCustomer(Customer customer)
    {
        customerRepository.save(customer);
        return "redirect:/customer";
    }


    @RequestMapping(value = "/editCustomer", method = RequestMethod.GET)
    public String editCustomer(@RequestParam("id") Long customerId,Model model)
    {
        Optional<Customer>  customerEdit = customerRepository.findById(customerId);
        customerEdit.ifPresent(customer -> model.addAttribute("customer",customer));
        return "editCustomer";
    }

    @RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
    public String deleteCustomer(@RequestParam("id") Long customerId, Model model)
    {
        customerRepository.deleteById(customerId);
        return "redirect:/customer";
    }

}

