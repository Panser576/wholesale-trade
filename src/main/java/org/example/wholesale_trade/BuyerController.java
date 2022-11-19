package org.example.wholesale_trade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyerController {
    @GetMapping("/buyer")
    public String showBuyer(Model model){
        model.addAttribute("name", "Пупырка");
        return "buyer";
    }
}
