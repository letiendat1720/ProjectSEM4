package com.example.springboot02.controller;

import com.example.springboot02.entity.Order;
import com.example.springboot02.model.OrderRepository;
import com.example.springboot02.model.ProductRepository;
import com.example.springboot02.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @RequestMapping("/order")
    public String index(Model model)
    {
        List<Order> orders = (List<Order>) orderRepository.findAll();
        model.addAttribute("orders",orders);

        return "tableOrder";
    }
    @RequestMapping(value = "/addOrder")
    public String addOrder(Model model)
    {
        model.addAttribute("orders",new Order());
        return "addOrder";

    }

    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public String saveOrder(Order order)
    {
        orderRepository.save(order);
        return "redirect:/order";
    }


    @RequestMapping(value = "/editOrder", method = RequestMethod.GET)
    public String editOrder(@RequestParam("id") Long orderId,Model model)
    {
        Optional<Order>  orderEdit = orderRepository.findById(orderId);
        orderEdit.ifPresent(order -> model.addAttribute("order",order));
        return "editOrder";
    }

    @RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
    public String deleteOrder(@RequestParam("id") Long orderId, Model model)
    {
        orderRepository.deleteById(orderId);
        return "redirect:/order";
    }

}
