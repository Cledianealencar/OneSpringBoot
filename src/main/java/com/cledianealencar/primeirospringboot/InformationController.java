package com.cledianealencar.primeirospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InformationController {

    private final InformationService informationService;

    //Dependency injection via constructor
    public InformationController(InformationService informationService){
        this.informationService = informationService;
    }

    // Endpoint that responds at the URL http://localhost:8080/nome
    // When this URL is accessed, it executes the method and returns the name
    @GetMapping("/name")
    public String displayName(){
        return informationService.getName();
    }

    // Endpoint that responds at the URL http://localhost:8080/profissao
    // When this URL is accessed, it executes the method and returns the profession
    @GetMapping("/profession")
    public String displayProfession(){
        return informationService.getprofession();
    }









}
