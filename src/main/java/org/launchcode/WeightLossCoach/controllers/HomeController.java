package org.launchcode.WeightLossCoach.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping
    public String index(){return "index";}

//    @GetMapping("form")
//    public String newClientForm(){
//         return "main/contactform";
//    }
}


