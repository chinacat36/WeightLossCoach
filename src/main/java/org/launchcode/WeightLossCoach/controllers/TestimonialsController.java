package org.launchcode.WeightLossCoach.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestimonialsController {

    @GetMapping("/testimonials")
    public String testimonialView() {return "home/testimonials";}
}