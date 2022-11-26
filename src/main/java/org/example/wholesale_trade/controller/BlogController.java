package org.example.wholesale_trade.controller;

import org.example.wholesale_trade.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private postRepository postRepository;
    @GetMapping("/prais")
    public String praisMain(Model mobel) {
        return "prais-main";
    }

}
