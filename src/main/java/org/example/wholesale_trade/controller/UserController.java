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
public class UserController {

    @Autowired
    private postRepository postsRepository;

    @GetMapping("/log")
    public String userLog(Model model){
        return "user-log";
    }
    @GetMapping("/reg")
    public String userReg(Model model){
        return "user-reg";
    }
    @PostMapping("/reg")
    public String userAdd(@RequestParam String name, @RequestParam String pass, Model mobel) {
        Post post = new Post(name, pass);
        postsRepository.save(post);
        return "redirect:/log";
    }
    @GetMapping("/office/{id}")
    public String userOffice(@PathVariable(value = "id") long id, Model mobel) {
        if (!postsRepository.existsById(id)) {
            return "redirect:/";
        }
        Optional<Post> post = postsRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        mobel.addAttribute("post", res);
        return "user-office";
    }
}
