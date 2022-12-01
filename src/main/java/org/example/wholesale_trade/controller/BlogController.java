package org.example.wholesale_trade.controller;

import org.example.wholesale_trade.model.Post;
import org.example.wholesale_trade.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private postRepository postRepository;
    @GetMapping("/prais")
    public String praisMain(Model mobel) {
        Iterable<Post> posts = postRepository.findAll();
        mobel.addAttribute("posts", posts);
        return "prais-main";
    }
    @GetMapping("/prais/add")
    public String praisAdd(Model mobel) {
        return "prais-add";
    }

    @PostMapping("/prais/add")
    public String praisPostAdd(@RequestParam String title,@RequestParam String price,@RequestParam String full_text, Model mobel) {
        Post post = new Post(title, price, full_text);
        postRepository.save(post);
        return "redirect:/prais";
    }

    @GetMapping("/prais/{id}")
    public String praisInfo(@PathVariable(value = "id") long id, Model mobel) {
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        mobel.addAttribute("post", post);
        return "prais-info";
    }

}
