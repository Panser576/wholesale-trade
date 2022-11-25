package org.example.wholesale_trade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyerController {
    @GetMapping("/")
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
