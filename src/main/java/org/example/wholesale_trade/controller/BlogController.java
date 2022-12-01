package org.example.wholesale_trade.controller;


import org.example.wholesale_trade.model.Post;
import org.example.wholesale_trade.repository.postRepository;
import org.example.wholesale_trade.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;
    @GetMapping("/prais")
    public String praisMain(Model mobel) {
        Iterable<Post> posts = postRepository.findAll();
        mobel.addAttribute("posts", posts);
        return "prais-main";
    }
    @GetMapping("/prais/add")
    public String praisAdd(Model mobel) {
        return "prais-add.html";
    }

    @PostMapping("/prais/add")
    public String praisPostAdd(@RequestParam String title,@RequestParam String price,@RequestParam String full_text, Model mobel) {
        Post post = new Post(title, price, full_text);
        postRepository.save(post);
        return "redirect:/prais";
    }
}
