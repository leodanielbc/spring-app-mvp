package com.leo.spring.app1.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detail")
    public String info() {

        return "detail_product";
    }
}
