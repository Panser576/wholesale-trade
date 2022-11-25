package org.example.wholesale_trade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/prais")
    public String praisMain(Model mobel) {
        return "prais-main";
    }

}
