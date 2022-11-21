package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("")
public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String welcome(Model model){
        model.addAttribute("product", productService.findAll());
        return "index2";
    }
}
