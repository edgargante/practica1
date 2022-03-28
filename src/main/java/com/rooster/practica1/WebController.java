package com.rooster.practica1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebController {
    @RequestMapping("/")
    public String index() {
        return "Rooster - Equipo 11";
    }
}