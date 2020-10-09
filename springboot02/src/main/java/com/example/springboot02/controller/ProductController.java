package com.example.springboot02.controller;

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
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/product")
    public String index(Model model)
    {
        List<Product> products = (List<Product>) productRepository.findAll();
        model.addAttribute("products",products);

        return "tableProduct";
    }
    @RequestMapping(value = "/addProduct")
    public String addProduct(Model model)
    {
        model.addAttribute("products",new Product());
        return "addProduct";

    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String saveProduct(Product product)
    {
        productRepository.save(product);
        return "redirect:/product";
    }


    @RequestMapping(value = "/editProduct", method = RequestMethod.GET)
    public String editProduct(@RequestParam("id") Long productId,Model model)
    {
        Optional<Product>  productEdit = productRepository.findById(productId);
        productEdit.ifPresent(product -> model.addAttribute("product",product));
        return "editProduct";
    }

    @RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam("id") Long productId, Model model)
    {
        productRepository.deleteById(productId);
        return "redirect:/product";
    }

    @RequestMapping(value = "/deleteAllProduct", method = RequestMethod.GET)
    public String deleteAllProduct(Model model)
    {
        productRepository.deleteAll();
        return "redirect:/product";
    }

}
