package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class pagecontroller {

    @RequestMapping("/Home")
    public String Home() {

        System.out.println("home page handel");
        return "Home";
    }

}
