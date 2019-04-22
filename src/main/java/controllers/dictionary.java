package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionary {
    @GetMapping("/dictionary")
    public String dictionary() {
        return "index";
    }

    @PostMapping("/dictionary")
    public String dictionary(String english, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin Chào");
        dictionary.put("what", "là gì");
        dictionary.put("book", "Quyển vở");
        dictionary.put("blue", "xanh");
        String vietnamese = dictionary.get(english);
        model.addAttribute("english",english);
        model.addAttribute("vietnamese",vietnamese);
        return "index";

    }
}
