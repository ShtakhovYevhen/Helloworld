package com.springhelloapp.controller;


import com.springhelloapp.model.Note;
import com.springhelloapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloWorldController  {
    @Autowired
    private HelloService service;

    @GetMapping("/hello")
    public String getHello(Model model){
        Note note = service.findById(0);
        model.addAttribute(note);
        return "hello";
    }
}
