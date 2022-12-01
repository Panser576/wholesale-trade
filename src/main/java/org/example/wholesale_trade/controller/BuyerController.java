package org.example.wholesale_trade.controller;

import org.example.wholesale_trade.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class BuyerController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }
    @GetMapping("/main")
    public String buyer(Model model){
        model.addAttribute("title", "Главная страница");
        return "buyer";
    }
    @GetMapping("/office")
    public String office(Model model){
        return "office";
    }
    @GetMapping("/contacts")
    public String contacts(Model model){
        return "contacts";
    }
    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }
    @GetMapping("/shipping")
    public String shipping(Model model){
        return "shipping";
    }
    @GetMapping("/payment")
    public String payment(Model model){
        return "payment";
    }

}
