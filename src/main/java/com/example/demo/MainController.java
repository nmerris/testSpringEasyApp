package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// this is like a main method for Spring
// see afuas gitHub page for a simple super easy example of spring
// you should see something in your browser at http://localhost:8080

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "HELLO!");
        return "hello";
    }
}
