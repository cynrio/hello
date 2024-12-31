package com.maybank.hello.controller;

import com.maybank.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloWorldService;

    @GetMapping("/")
    public String helloWorld(Model model) {
        String msg = helloWorldService.getMessage().getMessage();
        model.addAttribute("message", msg);
        return "hello"; // This will refer to hello.html
    }

    @PostMapping("/save")
    public String saveMessage(@RequestParam String message) {
        helloWorldService.saveMessage(message);
        return "redirect:/"; // Redirect to home after saving
    }
}