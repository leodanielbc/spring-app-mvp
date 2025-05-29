package com.leo.spring.app1.app1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detail")
    /* public String info(Model model) {
        model.addAttribute("Title", "Detail Product");
        model.addAttribute("Product", "Product 1"); 
        model.addAttribute("Description", "description of product 1");

        return "detail_product";
    }*/

    public String info(Map<String, Object> model) {
        model.put("Title", "Detail Product");
        model.put("Product", "Product 1");
        model.put("Description", "description of product 1");

        return "detail_product";
    }
}
