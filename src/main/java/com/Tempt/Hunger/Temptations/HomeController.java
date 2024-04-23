package com.Tempt.Hunger.Temptations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "proper"; // Assuming "proper.html" exists in the src/main/resources/templates directory
    }
}

