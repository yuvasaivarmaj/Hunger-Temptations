package com.Tempt.Hunger.Temptations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurity {

    @GetMapping("/")
    public String home() {
        return "<h2>Welcome to the Home Page</h2>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h2>Hello user</h2>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h2>Hello admin</h2>";
    }
}
