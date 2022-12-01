package org.example.wholesale_trade.controller;

import org.example.wholesale_trade.domein.Role;
import org.example.wholesale_trade.domein.User;
import org.example.wholesale_trade.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model ) {
        User userFromDb = userRepo.findByUsername(user.getUsername());
        if (userFromDb != null){
            model.put("message", "User exsists!");
            return "registration";
    }
             user.setActive(true);
            user.setRoles(Collections.singleton(Role.USER));
            userRepo.save(user);


             return "redirect:/login";
    }
}