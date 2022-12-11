package org.example.wholesale_trade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyerController {
    @GetMapping("/prais")
    public String buyer(Model model){
        return "buyer";
    }
    @GetMapping("/office")
    public String office(Model model){
        return "office";
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
    @GetMapping("/regs")
    public String regs(Model model){
        return "registr";
    }
    @GetMapping("/logs")
    public String logs(Model model){
        return "login";
    }

}
