package com.exaple.mainprojectspring.mainprojectspring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {

    @RequestMapping("/hello")
    public String add(){
        return "Heyyy";
    }
    
}
