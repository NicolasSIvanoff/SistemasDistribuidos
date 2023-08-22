package com.br.faccat.sistdist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LivroController {
    @GetMapping
    public String get(){
        return "teste";
    }
}
