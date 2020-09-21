package com.example.spring_bot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public String getCliente(){
        return "Vai retornar todos os clientes";
    }

    @GetMapping("/cliente/{codigo}")
    public String getClientebyCogigo(@PathVariable int codigo){
        return "O cliente do codigo " + codigo;
    }
}
