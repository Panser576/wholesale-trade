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
    @GetMapping("/")
    public String praisMain(Model mobel) {
        Iterable<Post> posts = postRepository.findAll();
        mobel.addAttribute("posts", posts);
        return "prais-main";
    }

    @GetMapping("/add")
    public String praisAdd(Model mobel) {
        return "prais-add";
    }

    @PostMapping("/add")
    public String praisPostAdd(@RequestParam String title, @RequestParam String image, @RequestParam int quantity, @RequestParam int price,@RequestParam String full_text, Model mobel) {
        Post post = new Post(title, image, quantity, price, full_text);
        postRepository.save(post);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String praisInfo(@PathVariable(value = "id") long id, Model mobel) {
        if(!postRepository.existsById(id)){
            return "redirect:/";
        }
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        mobel.addAttribute("post", res);
        return "prais-info";
    }
    @GetMapping("/{id}/edit")
    public String praisEdit(@PathVariable(value = "id") long id, Model mobel) {
        if(!postRepository.existsById(id)){
            return "redirect:/";
        }
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        mobel.addAttribute("post", res);
        return "prais-edit";
    }
    @PostMapping("/{id}/edit")
    public String praisPostUpdate(@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam String image, @RequestParam int quantity, @RequestParam int price,@RequestParam String full_text, Model mobel) {
        Post post = postRepository.findById(id).orElseThrow();
        post.setTitle(title);
        post.setImage(image);
        post.setFull_text(full_text);
        post.setPrice(price);
        post.setQuantity(quantity);
        postRepository.save(post);
        return "redirect:/";
    }
    @PostMapping("/{id}/remove")
    public String praisPostDelete(@PathVariable(value = "id") long id, Model mobel) {
        Post post = postRepository.findById(id).orElseThrow();
        postRepository.delete(post);
        return "redirect:/";
    }




}
