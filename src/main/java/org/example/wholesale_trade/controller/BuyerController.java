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
}
